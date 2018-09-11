
public class ShalloweCopy {

	public static void main(String[] args) {

		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {

			//참조 하는 대상을 복사 후 cpy가 참조하게끔 만듦
			cpy = (Rectangle) org.clon();  
			org.changePos(2, 2, 7, 7);  
			org.showPosition();
			cpy.showPosition();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
