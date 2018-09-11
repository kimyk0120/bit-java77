package constructorInjection;

public class Menu {

	private String desc;
	private int price;
	private ISand sand;

	
	
	public Menu() {
		System.out.println("Menu 기본 생성자");
	}

	public Menu(String desc) {
		System.out.println("Menu String 생성자 : " + desc);
		this.desc = desc;
	}
	public Menu(int price) {
		this.price = price;
		System.out.println("Menu int 생성자 : " + price);
	}

	public Menu(ISand sand) {
		System.out.println("Menu Bean 참조 받는 클래스");
	}
	
	
	public Menu(String desc, int price){
		this.desc = desc;
		this.price = price;
		System.out.println("메뉴 다중 파라미터 생성자 호출 : " + desc + "-"+ price);
	}
	
	public void printSand(){
		sand.info();
	}
	
	
}
