
public class Account {	
	String name;
	String id;
	String password;
	String email;
	
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + " id:" + id + " password:" + password + " email:" + email);
	}
	
}
