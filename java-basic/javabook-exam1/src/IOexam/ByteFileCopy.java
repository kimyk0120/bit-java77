package IOexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
	public static void main(String[] args) throws Exception {

		InputStream in = new FileInputStream("a.zip");
		OutputStream out = new FileOutputStream("asd.zip");

		int copyByte = 0;
		int bData;

		while (true) {

			bData = in.read();
			if (bData == -1)
				break;

			out.write(bData);
			copyByte++;

		}

		in.close();
		out.close();
		System.out.println("복사된 바이트 크기: " + copyByte);

	}

}
