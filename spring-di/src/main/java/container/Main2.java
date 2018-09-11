package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		
		
//		// 클래스 패스 기준으로 xml 파일 로딩하기
//		String cpPath = "container/container.xml";
//		ApplicationContext container = new ClassPathXmlApplicationContext(cpPath);
//		
//		System.out.println("컨테이너 로딩 전");
//		System.out.println("컨테이너 로딩 종료");

		// 파일시스템 기준으로 xml 파일 로딩하기
		
		String cpPath = "src/main/resources/container/container.xml";
		System.out.println("컨테이너 로딩 전");
		ApplicationContext container = new FileSystemXmlApplicationContext(cpPath);
		
		System.out.println("컨테이너 로딩 종료");

		// Bean 객체 접근하기
		ISand sand = (ISand)container.getBean("ham");
		sand.info();
		sand = (ISand)container.getBean("ham2");
		sand.info();
		sand = (ISand)container.getBean("ham3");
		sand.info();
		sand = (ISand)container.getBean("ham4");
		sand.info();
		sand = (ISand)container.getBean("#ham5");
		sand.info();
	}

}
