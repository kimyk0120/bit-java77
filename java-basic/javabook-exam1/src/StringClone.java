
public class StringClone {

	public static void main(String[] args) {
		
		try{
			
			Person p1 = new Person("�̽¿�", 22);
			Person p2 = (Person)p1.clone();
			p2.changeName("������");
			
			Person p3 = (Person)p2.clone();
			p3.changeName("������");
			
			p1.showPersonInfo();
			p2.showPersonInfo();
			p3.showPersonInfo();
			
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
