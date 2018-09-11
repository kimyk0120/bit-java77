
public class Person implements Cloneable {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public void showPersonInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("");

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person cpy = (Person) super.clone();
		// cpy.name = new String(name);

		return cpy;
	}

}


