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
			// ���ۿ� �Է¹��ڸ� ������ �� 1�پ� �о�� �� �ִ�.
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			// ���� �����Ͱ� ���� �� null�� �������ش�.
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
