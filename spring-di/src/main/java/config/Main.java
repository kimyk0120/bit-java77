package config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String path = "config/test.xml";

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext(path);

		// ��������
		ConfigTest ct = (ConfigTest) cpxac.getBean("config1");
		ct.info();

	}
}
