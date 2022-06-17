package basic06_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		try {
			// 버퍼에 입력문자를 지정한 후 1줄씩 읽어올 수 있다.
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			// 읽은 데이터가 없을 때 null을 리턴해준다.
			String str = br.readLine();
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		new BufferedReaderTest().start();
	}

}
