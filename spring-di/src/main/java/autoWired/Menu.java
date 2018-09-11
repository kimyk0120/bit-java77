package autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu {
//	@Autowired
	private ISand sand;

//	@Autowired
	private ColaDrink colaDrink;
	
	public Menu() {
		System.out.println("Menu �⺻ ������");
	}

	@Autowired
	@Qualifier("cheese")
	public void setSand(ISand sand) {
		this.sand = sand;
	}

	@Autowired
	public void setColaDrink(ColaDrink colaDrink) {
		this.colaDrink = colaDrink;
	}
	
	public void info(){
		sand.info();
		colaDrink.info();
	}
}
