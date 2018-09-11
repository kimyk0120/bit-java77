package test;

public class DiTest {
	String name;
	String diTest;
	String addr;
	
	
	public DiTest() {
		System.out.println(" DiTest 기본 생성자 호출");
	}

	public DiTest(String name) {
		this.name = name;
		System.out.println("DiTest  String 생성자 호출 : " + name);
	}

	public void setPerson(Person p ){
		
	}

	public void setDiTest(String diTest) {
		this.diTest = diTest;
		System.out.println("DiTest setter injection 호출  : " + diTest);
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("setname 호출 : " + name);
	}


	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("setaddr 호출  : " + addr);
	}

		
	

	
}
