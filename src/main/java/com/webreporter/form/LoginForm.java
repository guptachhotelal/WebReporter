
package com.webreporter.form;

import java.util.logging.Logger;

/**
 *
 * @author Chhotelal
 */
public class LoginForm
{

	private static final Logger	LOG	= Logger.getLogger(LoginForm.class.getName());
	private String				userName;
	private String				passwd;

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPasswd()
	{
		return passwd;
	}

	public void setPasswd(String passwd)
	{
		this.passwd = passwd;
	}
}
