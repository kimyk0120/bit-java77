package exam.book;

class Auti{
	
}


public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		Integer iValue = 10; // auto boxing
		Double dValue = 3.14; // auto boxing

		System.out.println(iValue);
		System.out.println(dValue);

		int num1 = iValue; // auto Unboxing
		double num2 = dValue; // auto Unboxing

		System.out.println(num1);
		System.out.println(num2);

	}

}
