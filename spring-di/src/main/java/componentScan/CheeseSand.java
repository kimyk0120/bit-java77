package componentScan;

import org.springframework.stereotype.Component;

//ºóÀ¸·Î ÀÚµ¿ µî·ÏµÊ
//<bean id="cheeseSand" class="componentScan.CheeseSand">
@Component
public class CheeseSand implements ISand {

	private String title;

	public CheeseSand() {
		System.out.println("CheeseSand");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
