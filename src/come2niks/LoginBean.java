package come2niks;

//Data Encapsulation using Getters and Setters
public class LoginBean {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	public boolean valid;
	
	//getter and setter for firstname
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	
	//getter and setter for lastname
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	
	/* getter and setter for password */
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String newPassword)
	{
		password = newPassword;
	}
	
	/* getter and setter for username*/
	public String getUsername()
	{
		return username;
	}
	public void setUserName(String newUsername)
	{
		username = newUsername;
	}
	
	/* getter and setter for isvalid*/
	public boolean isValid()
	{
		return valid;
	}
	public void setValid(boolean newValid)
	{
		valid = newValid;
	}
}