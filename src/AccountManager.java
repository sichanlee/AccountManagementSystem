import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void addAccount() {
		Account account = new Account();
		System.out.print("Website name:");
		account.name = input.next();
		System.out.print("Account ID:");
		account.id = input.next();
		System.out.print("Account Password:");
		account.password = input.next();
		System.out.print("Account Email:");
		account.email = input.next();
		accounts.add(account);
	}
	
	public void deleteAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();
		int index = -1;
		for (int i = 0; i<accounts.size(); i++) {
			if (accounts.get(i).name.equals(websiteName)) {
				index = i;
				break;
			}			
		}
		
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("the account" + websiteName + "is deleted");
		}
		else {
			System.out.println("the account has not been registered");
			return;
		}
	}
	
	public void editAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();	
		for (int i = 0; i<accounts.size(); i++) {
			Account account = accounts.get(i);
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
					} // if
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewAccounts() {
//		System.out.print("Website name:");
//		String websiteName = input.next();	
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
	
}
