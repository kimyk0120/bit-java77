package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		
		
//		// Ŭ���� �н� �������� xml ���� �ε��ϱ�
//		String cpPath = "container/container.xml";
//		ApplicationContext container = new ClassPathXmlApplicationContext(cpPath);
//		
//		System.out.println("�����̳� �ε� ��");
//		System.out.println("�����̳� �ε� ����");

		// ���Ͻý��� �������� xml ���� �ε��ϱ�
		
		String cpPath = "src/main/resources/container/container.xml";
		System.out.println("�����̳� �ε� ��");
		ApplicationContext container = new FileSystemXmlApplicationContext(cpPath);
		
		System.out.println("�����̳� �ε� ����");

		// Bean ��ü �����ϱ�
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
