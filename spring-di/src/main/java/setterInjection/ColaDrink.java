package setterInjection;

public class ColaDrink {

	String title;

	public ColaDrink() {
	}

	public ColaDrink(String str) {
		this.title = str;
		System.out.println("�ݶ������ ȣ��:" + title);
	}

}
