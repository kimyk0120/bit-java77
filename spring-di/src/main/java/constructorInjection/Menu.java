package constructorInjection;

public class Menu {

	private String desc;
	private int price;
	private ISand sand;

	
	
	public Menu() {
		System.out.println("Menu �⺻ ������");
	}

	public Menu(String desc) {
		System.out.println("Menu String ������ : " + desc);
		this.desc = desc;
	}
	public Menu(int price) {
		this.price = price;
		System.out.println("Menu int ������ : " + price);
	}

	public Menu(ISand sand) {
		System.out.println("Menu Bean ���� �޴� Ŭ����");
	}
	
	
	public Menu(String desc, int price){
		this.desc = desc;
		this.price = price;
		System.out.println("�޴� ���� �Ķ���� ������ ȣ�� : " + desc + "-"+ price);
	}
	
	public void printSand(){
		sand.info();
	}
	
	
}
