package basic06_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderTest {

	public FileReaderTest() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		int cnt = 0;
		try {
			// C:/Users/Jiho Jung/Desktop
			
			File f = new File("C:/Users/Jiho Jung/Desktop/test.txt");
			FileReader fr = new FileReader(f);
			/*
			while(true) {
				int inData = fr.read();
				if(inData == -1) {
					break;
				}
				System.out.print((char)inData);
				cnt++;
				
			}
			*/
			
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String inData = br.readLine();
				if(inData == null) {
					break;
				}
				cnt++;
				System.out.println(inData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("\n"+cnt);
	}
	public static void main(String[] args) {
		new FileReaderTest().start();

	}

}
