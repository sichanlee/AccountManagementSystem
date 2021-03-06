package Account;

import java.util.Scanner;

public interface AccountInput {

	public String getName();
	
	public void setName(String name);
	
	public String getId();
	
	public void setId(String id);

	public String getPassword();
	
	public void setPassword(String password);
	
	public String getEmail();
	
	
	public void setEmail(String email);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setAccountName(Scanner input);
	
	public void setAccountID(Scanner input);
	
	public void setAccountPassword(Scanner input);
	
	public void setAccountEmail(Scanner input);
}