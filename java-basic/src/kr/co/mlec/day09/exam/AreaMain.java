package kr.co.mlec.day09.exam;

import java.util.Scanner;

class Shape {
	public void area() {
	}
}

class Rectangle extends Shape {
	Rectangle() {
	}

	int side1 = 0;
	int side2 = 0;
	
	Rectangle(int num1, int num2) {
		this.side1 = num1;
		this.side2 = num2;
	}
	public void area(){
		System.out.println("���簢���� ������ "+side1*side2);
	}
}

class Triangle extends Shape {
	Triangle() {
	}
	int side1 = 0;
	int side2 = 0;
	Triangle(int num1, int num2) {
		this.side1 = num1;
		this.side2 = num2;
	}
	public void area(){
		System.out.println("�ﰢ���� ���̴� "+side1*side2/2);
	}
}

class Circle extends Shape {
	Circle() {
	}
	int side = 0;
	Circle(int num1) {
		this.side = num1;
	}
	public void area(){
		System.out.println("���� ������ "+Math.PI*side*side);
	}
}

class Square extends Rectangle {
	Square() {
	}

	Square(int num1) {
		super(num1,num1);
		
	}

	public void area() {
		System.out.println("���簢���� ������" +side1 * side2);
	}

}

public class AreaMain {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 9 + 1);
		int num2 = (int) (Math.random() * 9 + 1);

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ���� ������ ������ ǥ���� ������ ���ڸ� �����մϴ�.(1~4)");
		System.out.println("1-���簢��, 2-���簢��, 3-�ﰢ��, 4-��, 5-����");
		System.out.print("���ϴ� ������ ��ȣ�� �����ϼ��� : ");
		int i = sc.nextInt();
		
		Shape s = null;
		
		switch (i) {
		case 1:
			s = new Square(num1);
			break;
		case 2:
			s = new Rectangle(num1, num2);
			break;
		case 3:
			s = new Triangle(num1, num2);
			break;
		case 4:
			s = new Circle(num1);
			break;
		case 5:
			System.exit(0);
		default:
			break;
		}
		s.area();
	}

}
