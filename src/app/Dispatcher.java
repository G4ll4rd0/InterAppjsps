package app;

import java.io.IOException;

import app.login.LoginTierFactory;
import flex.messaging.FlexContext;
import flex.messaging.FlexSession;
import mx.arkesol.communication.ProcessDataResult;
import mx.arkesol.error.Errors;
import mx.arkesol.file.FileUtils;
import mx.arkesol.file.PropertiesFile;
import mx.arkesol.tier.LoginTier;
import mx.arkesol.util.Constants;

public class Dispatcher
{
	private FlexSession flexSession;
	
	public Dispatcher()
	{
		flexSession = FlexContext.getFlexSession();
		
//		initSession();
	}
	
/*
	private final String COUNTER =	"myCounter";
	private final String USERNAME = "username";
	public void initSession()
	{
		System.out.println("Se inicializa el Dispatcher");
		
		flexSession= FlexContext.getFlexSession();
		
		if (flexSession.getAttribute(COUNTER) == null)
		{
			System.out.println("La sesion es nueva, crea valores");
			
			flexSession.setAttribute(COUNTER, new Integer(1));
		}
		
		if (flexSession.getAttribute(USERNAME) == null)
		{
			flexSession.setAttribute(USERNAME, "Sujit Reddy G");
		}
	}
	
	public int increaseCounter()
	{
		System.out.println("flexSession [" + flexSession.getId() + "]");
		System.out.println("flexSession [" + flexSession.getTimeoutPeriod() + "]");
		Integer i = (Integer) flexSession.getAttribute(COUNTER);
		
		System.out.println("increaseCounter [" + i + "]");
		
		i = i + 1;
		
		flexSession.setAttribute(COUNTER, i);
		
		System.out.println("increaseCounter [" + i + "]");
		
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("flexSession [" + flexSession.getTimeoutPeriod() + "]");
		
		return getCounter();
	}
	
	public String getUserName(String username)
	{
		String result = (String) flexSession.getAttribute(USERNAME);
		
		System.out.println("username posted: " + username);
		
		System.out.println("getUserName [" + result + "]");
		
		flexSession.invalidate();
		
		return result;
	}
	
	public int getCounter()
	{
		Integer result = (Integer) flexSession.getAttribute(COUNTER);
		
		System.out.println("getCounter [" + result + "]");
		
		return result.intValue(); 
	}
*/

	public ProcessDataResult _login(String app, String username, String passwd)
	{
		return _login(app, username, passwd, Constants.EMPTY);
	}
	
	public ProcessDataResult _login(String app, String username, String passwd, String code)
	{
		LoginTier tier = LoginTierFactory.create();
		
		return tier.login(app, username, passwd, code);
	}
	
	public ProcessDataResult _logout()
	{
		ProcessDataResult pdr = new ProcessDataResult();
		
		flexSession.invalidate();
		
		pdr.setResult(true);
		
		return pdr;
	}
	
	//FIXME: debe removerse para entrega a cliente
	public ProcessDataResult _testServer(String testServer)
	{
		ProcessDataResult pdr = new ProcessDataResult();
		
		String settings = null;
		
		try
		{
			String settingsPath = FileUtils.getWebAppConfigPath();

			settings = settingsPath + "settings.properties";
	    	
			PropertiesFile file = new PropertiesFile(settings);
			
			String testCode = file.getProperty("TEST_CODE");
			
			if (testCode != null && testCode.equals(testServer))
				pdr.setResult(true);
			else
				pdr.setResult(false);
			
			return pdr;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
			Errors error = new Errors();
			
			error.loadError(Errors.Codes.MISSING_FILE);
			
			error.extendsMessage("Localización del archivo [" + settings + "]");

			pdr.setError(error);
			
			return pdr;
		}
	}
}
