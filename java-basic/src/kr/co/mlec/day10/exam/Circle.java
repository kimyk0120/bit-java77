package kr.co.mlec.day10.exam;

public class Circle extends Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println(
				"���� ������ " + Math.PI * radius * radius + "�Դϴ�.");
	}
}
