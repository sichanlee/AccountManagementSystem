package Account;

import java.util.Scanner;

public class Account {	
	protected AccountKind kind = AccountKind.SearchEngine;
	protected String name;
	protected String id;
	protected String password;
	protected String email;
	
	public Account() {
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

	public void printInfo() {
		System.out.println("name:" + name + " id:" + id + " password:" + password + " email:" + email);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Website name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Account ID:");
		String id = input.next();
		this.setId(id);
		
		System.out.print("Account Password:");
		String password = input.next();
		this.setPassword(password);
		
		System.out.print("Account Email:");
		String email = input.next();
		this.setEmail(email);
	}
	
}
