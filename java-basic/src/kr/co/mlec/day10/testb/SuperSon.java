package kr.co.mlec.day10.testb;


public class SuperSon extends SuperMother {
	 private String name; 
	 public SuperSon(String MotherName, String SunName) {
	        super(MotherName);      //SuperMother Ŭ������ ������ ȣ��
	        this.name = SunName;
	    } 
	    public SuperSon(String MotherName,int MotherAge, String SunName) {
	        super(MotherName, MotherAge);   //SuperMother Ŭ������ ������ ȣ��
	        this.name = SunName;
	    }
	     public void printContent() { 
	     if (super.age > 0) System.out.println("���� �̸� : "+ super.name + " && �������� : " + super.age + " / �Ƶ� �̸� : " + name);  
	     else System.out.println("���� �̸� : "+ super.name + " / �Ƶ� �̸� : " + name); 
	    }  
	 }