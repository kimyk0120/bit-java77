/*
 * OutputStream�� write(int)�� int�� �����ϴ� 4����Ʈ �߿��� ���� 1����Ʈ�� ó��
 * Writer�� write(int)�� int�� �����ϴ� 4����Ʈ �߿��� ���� 2����Ʈ�� ó��
 * 
 * �⺻���� �����ϴ� ��� ����Ʈ�� ����ϰ� �ʹٸ�
 * DataOutputStream Ŭ������ Ȱ���Ѵ�
 */

package kr.co.mlec.day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam12 {

	public static void main(String[] args) {
//		write();
		read();
	}
	/*
	 * ioexam12.txt�� ������ ������ ���� �б�
	 * - DataOutputStream�� ���ؼ� ������ ������ ���� ����
	 *   �ݵ�� ������ ��Ģ ������� �о�� �Ѵ�
	 */
	private static void read(){
		try(
				FileInputStream fis = new FileInputStream("data/ioexam12.txt");
				DataInputStream dis = new DataInputStream(fis);
				){
				// ������ ������ �߿��ϴ�
				double d = dis.readDouble();
				int i = dis.readInt();
				char c = dis.readChar();
				String str = dis.readUTF();
				
				System.out.println("int : "+i);
				System.out.println("double : "+d);
				System.out.println("char : "+c);
				System.out.println("String : "+str);
				
				
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void write() {
		try ( // try ���ȿ� ������ close�� �� ���൵ �ȴ�
				FileOutputStream fos = new FileOutputStream("data/ioexam12.txt");
				DataOutputStream dos = new DataOutputStream(fos); // �⺻������ ����Ұ�
																	// ���ʿ� �־��ش�

		) {
			// 1001.1�� -> 8����Ʈ(�̷��� �����ϸ� �ȵȴ�)

			dos.writeInt(100); // 4����Ʈ ���
			dos.writeDouble(1.1); // 8����Ʈ ���
//			dos.writeChar('��'); // 2����Ʈ ���
			// 14 ����Ʈ

			// ���ڿ� ���
			// dos.write("�ȳ��ϼ���".getBytes("UTF-8")); // ���ڿ��� �ٷ� �����ü� �����Ƿ�
			// getBytes()�� ���ش�
			dos.writeUTF("�ȳ��ϼ���"); // ���� ���� ���ϰ� ����ϴ� ���

			System.out.println("���� ���� ����");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
