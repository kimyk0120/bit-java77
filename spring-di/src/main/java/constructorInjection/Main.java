package constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// constructorInjection/test.xml 파일의 내용을 로딩
		
		String path = "constructorInjection/test.xml";
		
		System.out.println("컨테이너 로딩");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
		
		System.out.println("컨테이너 로딩 종료");
		
//		Menu menu = (Menu)container.getBean("menu3");
//		menu.printSand();
		
	}
}
