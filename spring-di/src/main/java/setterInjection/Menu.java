package setterInjection;

public class Menu {

	private String desc;
	private int price;
	private ISand sand;

	
	
	public Menu() {
		System.out.println("Menu �⺻ ������");
	}

	public void setDesc(String desc) {
		System.out.println("setDesc ȣ�� : " + desc);
		this.desc = desc;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice ȣ�� : " + price);
	}

	public void setSand(ISand sand) {
		System.out.println("setSand ȣ��");
	}
	
	
	
	public void printSand(){
		sand.info();
	}
	
	
}
