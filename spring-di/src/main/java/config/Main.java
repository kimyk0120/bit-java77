package config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String path = "config/test.xml";

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext(path);

		// 정보보기
		ConfigTest ct = (ConfigTest) cpxac.getBean("config1");
		ct.info();

	}
}
