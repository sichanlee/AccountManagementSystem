package Account;

import java.util.Scanner;

public class BankAccount extends BasicAccount {
	
	protected String cardNumber;
	protected String CVCNum;
	
	public BankAccount(AccountKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountName(input);
		setAccountID(input);
		setAccountEmailwithYN(input);
		setCardNumberwithYN(input);
		setAccountPassword(input);
	}
	
	public void setCardNumberwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you have an card number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y' ) {
				setAccountEmail(input);
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
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " id:" + id + " password:" + password + " email:" + email + "card number:" + password + "CVC number:" + email);
	}
	

	
}
