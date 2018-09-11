package kr.co.mlec.day11.exam;

abstract class Animal{
	protected String name;
	
	public Animal(String name){
		this.name = name;
	}
	public abstract void eat();
	
	public abstract void cry();
	
}

interface Flyable{
	public void fly();
}

class Dog extends Animal{
	private String name;
	Dog(String name){
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println(name+": �Խ��ϴ�.");
	}

	@Override
	public void cry() {
		System.out.println(name+": �۸� ¢���ϴ�.");
	}
}

class Duck extends Animal implements Flyable{
	private String name;
	Duck(String name){
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(name+": �Խ��ϴ�.");
	}
	
	@Override
	public void cry() {
		System.out.println(name+": �в� ��ϴ�.");
	}
	
	public void fly(){
		System.out.println(name+": ������ �۴��Ÿ����� ���� ���մϴ�.");
	}

}

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("�۸���");
		Duck duck = new Duck("�в���");

		dog.eat();
		crying(new Dog("�۸���"));

		duck.eat();
		crying(duck);	
		flying(duck);
		}
		// Animal a = new Dog("�۸���");
		private static void crying(Animal a){
		a.cry();
		}

		// Flyable f = new Duck("�в���");
		private static void flying(Flyable f){
		f.fly();
		}
}
