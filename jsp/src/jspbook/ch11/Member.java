package jspbook.ch11;

public class Member {

	private String name;
	private String email;
	private int num = 10;
	public Member(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public Member() {
		name="ȫ�浿";
		email="test@test.net";
	}

	public String getName() { return name; }
	public String getEmail() { return email; }
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
}