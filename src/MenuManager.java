import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);

		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					accountManager.addAccount();
					break;
				case 2:
					accountManager.deleteAccount();
					break;
				case 3:
					accountManager.editAccount();
					break;
				case 4:
					accountManager.viewAccounts();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please insert number.");
				break;
			}
		}

	}

	public static void showMenu() {
		System.out.println("*** Account Management System Menu ***");
		System.out.println(" 1. Add Account");
		System.out.println(" 2. Delete Account");
		System.out.println(" 3. Edit Account");
		System.out.println(" 4. View Accounts");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}
