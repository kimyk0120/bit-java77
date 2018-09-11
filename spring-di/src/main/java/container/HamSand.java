package container;

public class HamSand implements ISand {

	private String title;

	public HamSand() {
		this.title="ÇÜ";
		System.out.println("HamSand ±âº» »ý¼ºÀÚ È£ÃâµÊ");
	}

	public HamSand(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void info() {
		System.out.println(title);
	}

}
