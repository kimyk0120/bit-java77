package componentScan;

import org.springframework.stereotype.Component;


// ºóÀ¸·Î ÀÚµ¿ µî·ÏµÊ
// <bean id="hamSand" class="componentScan.HamSand">
@Component("ham")
public class HamSand implements ISand {

	private String title;

	public HamSand() {
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
