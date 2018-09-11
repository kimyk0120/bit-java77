package container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {
	public static void main(String[] args) {
		
		
/*		// Ŭ���� �н� �������� xml ���� �ε��ϱ�
		String cpPath = "container/container.xml";

		// File�� �о �ε��ϴ� Resource ��ü
		ClassPathResource cpr = new ClassPathResource(cpPath);
*/		

		// ���� �ý��� �������� xml ���� �ε��ϱ�
		String cpPath = "src/main/resources/container/container.xml";
		 
		// File�� �о �ε��ϴ� Resource ��ü
		FileSystemResource cpr = new FileSystemResource(cpPath);

		// �����̳� : BeanFactory
		System.out.println("�����̳� �ε� ��");
		
		BeanFactory container = new XmlBeanFactory(cpr);
		
		System.out.println("�����̳� �ε� ����");

		// Bean ��ü �����ϱ�
		HamSand ham = (HamSand)container.getBean("ham");
		ham.info();
	}

}
