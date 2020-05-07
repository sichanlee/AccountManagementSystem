package Account;

import java.util.Scanner;

public class TransportAccount extends BasicAccount {
	
	public TransportAccount(AccountKind kind) {
		super(kind);
	}

	
	public void getUserInput(Scanner input) {
		setAccountName(input);
		setAccountID(input);
		setAccountEmailwithYN(input);
		setAccountPassword(input);
	}

}
