package kr.co.mlec.day10.exam;

public class Triangle extends Shape {
	private int width; 
	private int height;
	public Triangle(int width, int height) {
		this.width  = width;
		this.height = height;
	}
	
	public void area() {
		System.out.println("�ﰢ���� ���̴� " + width * height / 2 + "�Դϴ�.");
	}

}









