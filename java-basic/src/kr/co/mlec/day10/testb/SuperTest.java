package kr.co.mlec.day10.testb;


public class SuperTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		 SuperMother mom = new SuperMother("����");   
		   mom.printContent();   
		   SuperSon son = new SuperSon("����", "����");
		        son.printContent();      
		   SuperSon sunConten = new SuperSon("����", 50 ,"����");
		        sunConten.printContent();    


	}

}
