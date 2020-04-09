
public class Account {	
	String name;
	String id;
	String password;
	String email;
	static int numAccountsRegistered = 0;
	
	public Account() {
		numAccountsRegistered++;
	}

	public Account(String name, String id) {
		this.name = name;
		this.id = id;
		numAccountsRegistered++;
	}
	
	public Account(String name, String id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		numAccountsRegistered++;
	}

	public void printInfo() {
		System.out.println("name:" + name + " id:" + id + " password:" + password + " email:" + email);
	}
	
}
