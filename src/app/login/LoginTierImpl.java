package app.login;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import flex.messaging.FlexContext;
import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.file.FileUtils;
import mx.arkesol.file.PropertiesFile;
import mx.arkesol.fs.dao.VwAksUsersDao;
import mx.arkesol.fs.dto.VwAksUsers;
import mx.arkesol.fs.dto.VwAksUsersData;
import mx.arkesol.fs.factory.VwAksUsersDaoFactory;
import mx.arkesol.log.log4j.AksLogger;
import mx.arkesol.tier.LoginTier;
import mx.arkesol.tier.VwAksUsersDataTier;
import mx.arkesol.util.Constants;

public class LoginTierImpl implements LoginTier
{
	protected Connection userConn;
	private ProcessDataResult pdr	= null;
	private Errors error 			= null;
	
	//se crea para asegurar la carga de la configuracion
	private Logger logger = AksLogger.getLoggerWeb(LoginTierImpl.class);
	
	private VwAksUsersDao dao = null;
	
	public LoginTierImpl()
	{		
		dao 	= VwAksUsersDaoFactory.create();
		pdr 	= new ProcessDataResult();
		error	= new Errors();
	}
	
	public LoginTierImpl(Connection conn)
	{
		this.userConn	= conn;
		
		dao 			= VwAksUsersDaoFactory.create(conn);
		pdr 			= new ProcessDataResult();
		error			= new Errors();
	}
	
	@Override
	public ProcessDataResult login(String app, String username, String passwd)
	{
		return login(app, username, passwd, Constants.EMPTY);
	}


	@Override
	public ProcessDataResult login(String app, String username, String passwd, String appCode)
	{
		List<Object> results = null;
		
		boolean login 	= false; 
		boolean allowed	= false;
		
		String sql;
		
		try
		{
			//vista "propia" para que esté estandarizado
			//en cualquier sistema
			VwAksUsers[] array = null;
			VwAksUsers user = null;
			
			ArrayList<Object> sqlParams = new ArrayList<Object>();
			
			String testCode	= null;
			int testLevel	= 0;
			
			if (appCode.length() >= 0)
			{
				String settingsPath = FileUtils.getWebAppConfigPath();
	
				PropertiesFile sf = new PropertiesFile(settingsPath + SETTINGS_FILE);
				
				try
				{
					testLevel = Integer.parseInt(sf.getProperty(TEST_LEVEL));
				} catch (NumberFormatException e){}
				
				testCode = sf.getProperty(TEST_CODE);
			}
			
			//busca el usuario de todas maneras para cargar sus datos, pero no es "restrictivo
			sql = "username = ?";
			sqlParams.add(username);
			
			//si el código proporcionado es igual al del archivo, determinar nivel
			if (appCode.equals(testCode) 
					&& (testLevel == DEBUG_FULL
						|| testLevel == DEBUG_SEMI))
			{
				logger.warn("Usuario [" + username + "] intenta registrarse en la aplicación con 'testCode' valido y un 'testLevel' [" + testLevel + "]");
				
				//se marca como valido, así aunque username no exista, podrá entrar
				if (testLevel == DEBUG_FULL)
				{
					login = true;
				}
			}
			//si el codigo no es correcto para debug, consulta password
			else
			{
				sql += " AND passwd = (SELECT fn_password(?, salt) FROM users WHERE username = ?)";
				sqlParams.add(passwd);
				sqlParams.add(username);
			}
			
			array = dao.findByDynamicWhere(sql, sqlParams.toArray());
			
			user = array.length == 0 ? null : array[0];
			
			if (user != null)
				login = true;
		
			if (login)
			{
				//TODO: se cargan todos sus permisos sobre la aplicacion para validarlo
				//perms.getFullAccessData(app, username);
				
				allowed = true;//perms.getPermApp(app);
			}

			//tiene acceso a la aplicacion
			if (allowed)
			{
				results = new ArrayList<Object>();
				
				VwAksUsersDataTier tier = new VwAksUsersDataTier();
				VwAksUsersData usersData = tier.get(user.getUserId());
				
				//sesion
				results.add(FlexContext.getFlexSession().getId());
				
				//borrado de la contraseña y salt antes de enviarlo
				user.setPasswd(null);
				user.setSalt(null);
				
				//usuario
				results.add(user);
				
				//datos de usuario
				results.add(usersData);
				
				//permisos
				//TODO: por el momento no regresa nada en el objeto de permisos 
				//results.add(perms);
				results.add(null);
				
				pdr.setResult(results);
				
				return pdr;
			}
			else
			{
				if (!login)
					logger.info("Usuario [" + username + "] intenta registrarse en la aplicación sin éxito");
				else
					logger.info("Usuario [" + username + "] no tiene permisos sobre aplicación");
				
				error.setCode(Errors.Codes.LOGIN.getCode());
				error.setWindowTitle(Errors.Codes.LOGIN.getWindowTitle());
				error.setMessage(Errors.Codes.LOGIN.getMessage());
				
				pdr.setError(error);
				
				return pdr;
			}
		}
		catch (Exception e)
		{
			error.setCode(Errors.Codes.NOT_DEFINED.getCode());
			error.setWindowTitle(Errors.Codes.NOT_DEFINED.getWindowTitle());
			error.setMessage(Errors.Codes.NOT_DEFINED.getMessage());
			
			pdr.setError(error);
			
			if (logger.isDebugEnabled())
				e.printStackTrace();
			
			return pdr;
		}
	}
}
