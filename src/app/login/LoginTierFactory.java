package app.login;

import java.sql.Connection;

import mx.arkesol.tier.LoginTier;

public class LoginTierFactory
{

	/**
	 * Method 'create'
	 * 
	 * @return LoginTier
	 */
	public static LoginTier create()
	{
		return new LoginTierImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return LoginTierImpl
	 */
	public static LoginTier create(Connection conn)
	{
		return new LoginTierImpl( conn );
	}
}
