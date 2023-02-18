package study;

public class User {
	private String userName;
	private int id;
	private String password;
	
	public User(String userName, int id, String password) {
		this.userName = userName;
		this.id = id;
		this.password = password;
	}
	
	protected void printAccountInfo() {
		System.out.println("ユーザー名は、" + this.userName);
		System.out.println("IDは、" + this.id);
		System.out.println("パスワードは、" + this.password);
	}
	 
}
