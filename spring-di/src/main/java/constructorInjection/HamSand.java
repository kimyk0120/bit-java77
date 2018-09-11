package constructorInjection;

public class HamSand implements ISand {

	private String title;

	public HamSand() {
		this.title="햄";
		System.out.println("HamSand 기본 생성자 호출됨");
	}
	
	

	public HamSand(String title) {
		this.title = title;
		System.out.println("HamSand String 생성자 호출 : " + title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
