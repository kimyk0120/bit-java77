package test;

public class DiTest {
	String name;
	String diTest;
	String addr;
	
	
	public DiTest() {
		System.out.println(" DiTest �⺻ ������ ȣ��");
	}

	public DiTest(String name) {
		this.name = name;
		System.out.println("DiTest  String ������ ȣ�� : " + name);
	}

	public void setPerson(Person p ){
		
	}

	public void setDiTest(String diTest) {
		this.diTest = diTest;
		System.out.println("DiTest setter injection ȣ��  : " + diTest);
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("setname ȣ�� : " + name);
	}


	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("setaddr ȣ��  : " + addr);
	}

		
	

	
}
