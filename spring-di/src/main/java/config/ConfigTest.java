package config;

public class ConfigTest {

	private String user;
	private String pass;
	
	
	
	public ConfigTest() {
		System.out.println("생성자 호출됨");
	}


	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void info(){
		System.out.println("user : " + user);
		System.out.println("pass : " + pass);
	}
	
}
