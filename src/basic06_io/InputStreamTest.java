package basic06_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		
		// input, output
		// input(byte), reader(����) ������ �Է��� �о��
		try {
			// byte ���� ���ڸ� �Է¹޴´�.
			InputStream in = System.in;
			// System.out.println(System.in.getClass());
			/*
			int inData = 0;
			while(true) {
				
					inData = in.read(); // ���� ���� ������ return -1;
					if (inData == -1) break;
					System.out.println(inData);
				
				}
			*/
			
			byte[] data = new byte[10];
			int cnt = in.read(data);
			System.out.println("cnt ->" + cnt);
			System.out.println("text ->" + new String(data,0,cnt));
			}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new InputStreamTest().start();

	}

}
