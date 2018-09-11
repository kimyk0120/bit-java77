package autoWired;

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
