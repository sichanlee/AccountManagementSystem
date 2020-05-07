package Account;

import java.util.Scanner;

public class GamesAccount extends Account  {

	public GamesAccount(AccountKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountName(input);
		setAccountID(input);
		setAccountPassword(input);
		setAccountEmail(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " id:" + id + " password:" + password + " email:" + email);
	}
	
}
