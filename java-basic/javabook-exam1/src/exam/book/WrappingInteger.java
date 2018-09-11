package exam.book;

 class WrappingInteger {

	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));

	}

}
