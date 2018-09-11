package collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "collection/test.xml";

		System.out.println("�����̳� �ε���");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
		
		System.out.println("�����̳� �ε� ��");
		
		
		Menu menu = container.getBean("menu",Menu.class);
		System.out.println("list-----------------------");

		menu.printList();
		
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("Set-----------------------");
		
		menu.printSet();
		
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("Map-----------------------");
		
		menu.printMap();
		
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("prop-----------------------");
		
		menu.printProps();
	}
}
