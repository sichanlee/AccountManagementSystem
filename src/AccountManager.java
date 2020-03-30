import java.util.Scanner;

public class AccountManager {
	Account account;
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void addAccount() {
		account = new Account();
		System.out.print("Website name:");
		account.name = input.next();
		System.out.print("Account ID:");
		account.id = input.next();
		System.out.print("Account Password:");
		account.password = input.next();
		System.out.print("Account Email:");
		account.email = input.next();
	}
	
	public void deleteAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();	
		if (account == null) {
			System.out.println("the account has not been registered");
			return;
		}
		if (account.name.equals(websiteName)) {
			account = null;
			System.out.println("the account is deleted");
		}
	}
	
	public void editAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();	
		if (account.name.equals(websiteName)) {
			System.out.println("the account to be edited is " + account.name);
		}
	}
	
	public void viewAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();	
		if (account.name.equals(websiteName)) {
			account.printInfo();
		}
	}

}
