
public class Business implements Cloneable{

	
	private String company;
	private String work;
	
	public Business(String company,String work){
		this.company = company;
		this.work = work;
	}
	
	
	public void  showBusinessInfo() {
		System.out.println("ȸ�� : " + company);
		System.out.println("���� : " + work);
	}
	
	
	public void changeWork(String work) {
		this.work = work;
	}


	@Override
	public Object clone() throws CloneNotSupportedException {

		Business copy = (Business)super.clone();
		return copy;
	}
	
	
	
	
}
