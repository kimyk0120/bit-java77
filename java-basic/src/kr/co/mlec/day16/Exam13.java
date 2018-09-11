/*
 * ��ü�� �����ϰ� �д� ���
 * 
 * ObjectInputStream, ObjectOutputStream
 * 
 * ��ü�� ��� : ����ȭ, ��ü�� �޸��� ������ �����ִ� ����Ʈ ������ ���°�
 * ����ȭ ���� : ��� Ŭ������ �ݵ�� Serializable �������̽��� ����ؾ���
 * 
 * ����Ʈ�� ������ ��ü�� ���� : ������ȭ
 */

package kr.co.mlec.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// ��ũ �������̽�, ����� ���� ���� �����̶�� ǥ��, ����� ������Ű�� ���� �ƴ�
class Member implements Serializable{
	private String id;
	// �� �ʵ��� ���� ����, ����ȭ�� �ش簪�� ����
	private transient String pass;
	
	
	Member(){}
	Member(String id,String pass){
		this.id = id;
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

public class Exam13 {
	private static void write(){
		Member m = new Member("hong", "1111");
		try(	
			FileOutputStream fos = new FileOutputStream("data/ioexam13.txt");
			
			// ����ȭ�� ó���ϴ� Ŭ����
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			
//			String data = m.getId()+":"+m.getPass()+"\n";
//			fos.write(data.getBytes());

			oos.writeObject(m); // ����ȭ �޼���
			
			System.out.println("����ȭ ����");
			
		}
		catch(Exception e){
			
		}
	}
	
	private static void read(){
		try(
				FileInputStream fis = new FileInputStream("data/ioexam13.txt");
				
				// ������ȭ ó�� Ŭ����
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				
				){
			// Object Ÿ������ ��ȯ -> ����ȯ �۾� �ʿ�
			Member m = (Member)ois.readObject();
			System.out.println("id : "+m.getId());
			System.out.println("pass : "+m.getPass());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		// ����ȭ ȣ��
		write();
		
		// ������ȭ ȣ�� : ������ ������ ������ ��ü�� ��ȯ
		read();
		
	}
	
}
