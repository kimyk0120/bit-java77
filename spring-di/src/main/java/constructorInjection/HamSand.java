package constructorInjection;

public class HamSand implements ISand {

	private String title;

	public HamSand() {
		this.title="��";
		System.out.println("HamSand �⺻ ������ ȣ���");
	}
	
	

	public HamSand(String title) {
		this.title = title;
		System.out.println("HamSand String ������ ȣ�� : " + title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
