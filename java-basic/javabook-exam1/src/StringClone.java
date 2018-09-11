
public class StringClone {

	public static void main(String[] args) {
		
		try{
			
			Person p1 = new Person("ÀÌ½Â¿ø", 22);
			Person p2 = (Person)p1.clone();
			p2.changeName("Á¤Çý¿µ");
			
			Person p3 = (Person)p2.clone();
			p3.changeName("Á¤½ÂÁÖ");
			
			p1.showPersonInfo();
			p2.showPersonInfo();
			p3.showPersonInfo();
			
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
