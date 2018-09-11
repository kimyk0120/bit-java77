package configDivide;

public class Menu {

	private ISand sand;
	private ColaDrink colaDrink;
	
	public Menu() {
		System.out.println("Menu 기본 생성자");
	}

	public void setSand(ISand sand) {
		this.sand = sand;
	}

	public void setColaDrink(ColaDrink colaDrink) {
		this.colaDrink = colaDrink;
	}
	
	public void info(){
		sand.info();
		colaDrink.info();
	}
}
