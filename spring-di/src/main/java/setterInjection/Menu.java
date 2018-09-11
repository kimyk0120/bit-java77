package setterInjection;

public class Menu {

	private String desc;
	private int price;
	private ISand sand;

	
	
	public Menu() {
		System.out.println("Menu 기본 생성자");
	}

	public void setDesc(String desc) {
		System.out.println("setDesc 호출 : " + desc);
		this.desc = desc;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice 호출 : " + price);
	}

	public void setSand(ISand sand) {
		System.out.println("setSand 호출");
	}
	
	
	
	public void printSand(){
		sand.info();
	}
	
	
}
