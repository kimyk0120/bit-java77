
public class InstanceCloning {

	public static void main(String [] args){
		Point org = new Point(3, 5);
		Point cpy;
		
		
		try {
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
