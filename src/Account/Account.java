package Account;

import java.util.Scanner;

public abstract class Account implements AccountInput {	
	protected AccountKind kind = AccountKind.SearchEngine;
	protected String name;
	protected String id;
	protected String password;
	protected String email;
	
	public Account() {
	}
	
	public Account(AccountKind kind) {
		this.kind = kind;
	}

	public Account(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Account(String name, String id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	public Account(AccountKind kind, String name, String id, String email, String phone) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	public AccountKind getKind() {
		return kind;
	}

	public void setKind(AccountKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void printInfo();
	
	public void setAccountName(Scanner input) {
		System.out.print("Website name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setAccountID(Scanner input) {
		System.out.print("Account ID:");
		String id = input.next();
		this.setId(id);
	}
	
	public void setAccountPassword(Scanner input) {
		System.out.print("Account Password:");
		String password = input.next();
		this.setPassword(password);
	}
	
	public void setAccountEmail( Scanner input) {
		System.out.print("Account Email:");
		String email = input.next();
		this.setEmail(email);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case SearchEngine:
			skind = "Search";
			break;
		case Transport:
			skind = "Trans";
			break;
		case Games:
			skind = "Game";
			break;
		case Bank:
			skind = "Bank";
			break;
		default:
		}
		return skind;
	}
	
}
