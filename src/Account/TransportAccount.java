package Account;

import java.util.Scanner;

public class TransportAccount extends Account {
	
	public TransportAccount(AccountKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Website name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Account ID:");
		String id = input.next();
		this.setId(id);
		
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
		
		System.out.print("Account Password:");
		String password = input.next();
		this.setPassword(password);
	}
	
}
