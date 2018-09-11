package collection;

public class CheeseSand implements ISand {

	private String title;

	public CheeseSand() {
		System.out.println("cheeseSand 기본 생성자 호출됨");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
