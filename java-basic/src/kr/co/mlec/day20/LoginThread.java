package kr.co.mlec.day20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginThread extends Thread {

	private Socket client;

	public LoginThread(Socket client) {
		this.client = client;
	}

// http://localhost:10001/login?id=aaa&pass=1234
	public void run() {
		try {
			InputStream in = client.getInputStream();
			Scanner sc = new Scanner(in);
	
			// �α��� ���� �Ľ�
			LoginVO login = LoginParsing.parsing(sc.nextLine());
			
			// �α��� üũ
			boolean isLogin = LoginCheck.check(login);
			
			String body="";
			
			if(isLogin == true){
				body="<html><body><h1>�α��� ����</h1><script>alert('�α��� ����')</script></body></html>";
			}
			else{
				body="<html><body><h1>�α��� ����</h1></body></html>";
				
			}
			String startLine = "HTTP/1.1 200 OK\r\n";
			String header = "Cache-Control: no-cache\r\n"
					+"Content-Type: UTF-8tml; charset=EUC-KR\r\n"
					+"Content-Length: "
					+body.getBytes().length+"\r\n\r\n"; // ����� �ؿ� �������� ���� �� �־���Ѵ�
			String sendMsg = startLine + header + body;
			
			
			
			OutputStream out = client.getOutputStream();
			out.write(sendMsg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
