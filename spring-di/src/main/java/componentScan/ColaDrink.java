package componentScan;

import org.springframework.stereotype.Component;

//������ �ڵ� ��ϵ�
//<bean id="colaDrink" class="componentScan.ColaDrink ">
@Component
public class ColaDrink {

	String title;

	public ColaDrink() {
	}

	public void setTitle(String str) {
		this.title = str;
	}

	public void info() {
		System.out.println(title);
	}

}
