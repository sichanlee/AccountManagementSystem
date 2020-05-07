package Account;

import java.util.Scanner;

public abstract class BasicAccount extends Account {
	
	public BasicAccount(AccountKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input) ;

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " id:" + id + " password:" + password + " email:" + email);
	}
	
	public void setAccountEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y' ) {
				System.out.print("Account Email:");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N' ) {
				this.setEmail("");
				break;
			}
			else {
			}
		}
	}

}
