package basic06_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		
		// input, output
		// input(byte), reader(문자) 단위로 입력을 읽어옴
		try {
			// byte 단위 문자를 입력받는다.
			InputStream in = System.in;
			// System.out.println(System.in.getClass());
			/*
			int inData = 0;
			while(true) {
				
					inData = in.read(); // 읽은 값이 없을때 return -1;
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
