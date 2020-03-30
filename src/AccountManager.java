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
			int num = -1;
			while (num != 5) {
				System.out.println("** Account Info Edit Menu **");
				System.out.println(" 1. Edit Name");
				System.out.println(" 2. Edit Id");
				System.out.println(" 3. Edit password");
				System.out.println(" 4. Edit Email");
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1 - 5:");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Website name:");
					account.name = input.next();

				}
				else if (num == 2) {
					System.out.print("Account ID:");
					account.id = input.next();

				}
				else if (num == 3) {
					System.out.print("Account Password:");
					account.password = input.next();

				}
				else if (num == 4) {
					System.out.print("Account Email:");
					account.email = input.next();

				}
				else {
					continue;
				}
			}
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
