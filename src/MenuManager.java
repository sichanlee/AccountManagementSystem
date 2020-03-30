import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println("*** Account Management System Menu ***");
			System.out.println(" 1. Add Account");
			System.out.println(" 2. Delete Account");
			System.out.println(" 3. Edit Account");
			System.out.println(" 4. View Account");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num == 1) {
				accountManager.addAccount();
			}
			else if (num == 2) {
				accountManager.deleteAccount();
			}
			else if (num == 3) {
				accountManager.editAccount();
			}
			else if (num == 4) {
				accountManager.viewAccount();
			}
			else {
				continue;
			}
		}
	}
}
