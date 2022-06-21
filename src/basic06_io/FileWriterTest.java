package basic06_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTest {

	public FileWriterTest() {
		start();
	}
	
	public void start() {
		// 콘솔에서 문자열을 줄단위로 입력받아 파일로 쓰기
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String inData = br.readLine();
			
			File file = new File("C://Users/Jiho Jung/Desktop/dev", "outputTest.java");
			FileWriter fw = new FileWriter(file);
			
			fw.write(inData, 0, inData.length());
			
			fw.close();
			
		} catch (Exception e) {
			System.out.println("예외발생.");
		}
		System.out.println("프로그램이 종료되었습니다");
	}
	
	public static void main(String[] args) {
		new FileWriterTest();
	}
}
