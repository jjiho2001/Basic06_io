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
		// �ֿܼ��� ���ڿ��� �ٴ����� �Է¹޾� ���Ϸ� ����
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String inData = br.readLine();
			
			File file = new File("C://Users/Jiho Jung/Desktop/dev", "outputTest.java");
			FileWriter fw = new FileWriter(file);
			
			fw.write(inData, 0, inData.length());
			
			fw.close();
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�.");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}
	
	public static void main(String[] args) {
		new FileWriterTest();
	}
}
