
public class ShalloweCopy {

	public static void main(String[] args) {

		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {

			//���� �ϴ� ����� ���� �� cpy�� �����ϰԲ� ����
			cpy = (Rectangle) org.clon();  
			org.changePos(2, 2, 7, 7);  
			org.showPosition();
			cpy.showPosition();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
