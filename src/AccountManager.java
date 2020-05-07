import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Account.AccountInput;
import Account.AccountKind;
import Account.BankAccount;
import Account.GamesAccount;
import Account.TransportAccount;

public class AccountManager {
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	Scanner input;
	AccountManager(Scanner input) {
		this.input = input;
	}
	
	public void addAccount() {
		int kind = 0;
		AccountInput accountInput;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for SearchEngine");
			System.out.println("2 for Transport");
			System.out.println("3 for Bank");
			System.out.print("Select num 1, 2 or 3 for Account Kind:");
			kind = input.nextInt();
			if (kind == 1) {
				accountInput = new GamesAccount(AccountKind.SearchEngine);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (kind == 2) {
				accountInput = new TransportAccount(AccountKind.Transport);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (kind == 3) {
				accountInput = new BankAccount(AccountKind.Bank);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
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
		int index = findIndex(websiteName);
		removefromAccounts(index, websiteName);
	}
	
	public int findIndex(String websiteName) {
		int index = -1;
		for (int i = 0; i<accounts.size(); i++) {
			if (accounts.get(i).getName().equals(websiteName)) {
				index = i;
				break;
			}			
		}
		return index;
	}
	
	public void removefromAccounts(int index, String websiteName) {
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("the account" + websiteName + "is deleted");
			return;
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
			AccountInput account = accounts.get(i);
			if (account.getName().equals(websiteName)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAccountName(input);
						break;
					case 2:
						account.setAccountID(input);
						break;
					case 3:
						account.setAccountPassword(input);
						break;
					case 4:
						account.setAccountEmail( input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewAccounts() {
		System.out.println("# of registered accounts:" + accounts.size());
		for (int i = 0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
	

	
	public void showEditMenu() {
		System.out.println("** Account Info Edit Menu **");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit Id");
		System.out.println(" 3. Edit password");
		System.out.println(" 4. Edit Email");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
	
}
