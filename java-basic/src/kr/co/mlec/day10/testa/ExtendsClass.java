package kr.co.mlec.day10.testa;

import kr.co.mlec.day10.testb.*;

public class ExtendsClass extends StringUtil{
	public void test(){
		
		// �ܺ� ��Ű������ �������(���) ���� ������ ���� public
		// ��ġ�� ������� ��Ӱ��� Ŭ������ ���� ��� protected
		// ������ ���� ��Ű���� ���� ��� default
		// ������ ���� ���� ���� ��� private
		
		// API���� ���� Ŭ������ �������, �޼ҵ�� ��� public�̴�
		// Ŭ���� �̸����� �ٷ� �����ϴ� ���� static
		System.out.println(data);
//		System.out.println(magicNumber); // ���� �Ұ�
//		System.out.println(name); // ���� �Ұ�
		System.out.println(exStr);
	}
}
