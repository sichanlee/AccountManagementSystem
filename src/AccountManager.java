import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Account.AccountKind;
import Account.BankAccount;
import Account.TransportAccount;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void addAccount() {
		int kind = 0;
		Account account;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for SearchEngine");
			System.out.println("2 for Transport");
			System.out.println("3 for Bank");
			System.out.print("Select num 1, 2 or 3 for Account Kind:");
			kind = input.nextInt();
			if (kind == 1) {
				account = new Account(AccountKind.SearchEngine);
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 2) {
				account = new TransportAccount(AccountKind.Transport);
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 3) {
				account = new BankAccount(AccountKind.Bank);
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else {
				System.out.print("Select num for Account Kind between 1 and 2:");
			}
		}
	}
	
	public void deleteAccount() {
		System.out.print("Website name:");
		String websiteName = input.next();
		int index = -1;
		for (int i = 0; i<accounts.size(); i++) {
			if (accounts.get(i).getName().equals(websiteName)) {
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
			if (account.getName().equals(websiteName)) {
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
						String name = input.next();
						account.setName(name);
					}
					else if (num == 2) {
						System.out.print("Account ID:");
						String id = input.next();
						account.setId(id);
					}
					else if (num == 3) {
						System.out.print("Account Password:");
						String password = input.next();
						account.setPassword(password);
					}
					else if (num == 4) {
						System.out.print("Account Email:");
						String email = input.next();
						account.setEmail(email);
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
		System.out.println("# of registered accounts:" + accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
	
}
