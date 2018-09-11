package member.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import member.controller.MemberController;

public class MemberTest {

	public static void main(String[] args) {

		// 설정파일 로딩하기
		ApplicationContext container = new ClassPathXmlApplicationContext("config/spring/application-context.xml");

		MemberController control = container.getBean("memberController", MemberController.class);

		try {
			// 전체 회원 정보 조회
			 control.retrieveMember();
			// 특정 회원 조회
//			 control.retrieveMemberInfo("member-1");
			 //트랜잭션 처리 테스트
//			control.registMember();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
