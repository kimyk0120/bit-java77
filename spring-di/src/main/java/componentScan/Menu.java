package componentScan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Menu {
	
//	@Resource(name="cheeseSand")
	@Resource(name="ham")
	private ISand sand;
	
	@Resource
	private ColaDrink colaDrink;

	public Menu() {
		System.out.println("Menu �⺻ ������");
	}

	public void info() {
		sand.info();
		colaDrink.info();
	}
}
