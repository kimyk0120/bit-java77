
public class PersonalInfo implements Cloneable {

	private String name;
	private int age;
	private Business bness;

	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bness = new Business(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bness.showBusinessInfo();
		System.out.println();

	}

	public void changeWork(String work) {
		bness.changeWork(work);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bness = (Business)bness.clone();
		
		return copy;
	}



}
