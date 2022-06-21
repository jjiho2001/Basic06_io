package basic06_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		//C:\Users\Jiho Jung\git\Basic01\Basic01\src
		//C:\Users\Jiho Jung\Desktop
		File orgFile = new File("C://Users/Jiho Jung/git/Basic01/Basic01/src/GuGuDan.java");
		File tarFile = new File("C://Users/Jiho Jung/Desktop/dev/GuGuDan.java");
		
		try {
			//byte수 만큼 한번에 orgFile파일의 내용을 읽은 tarFile로 쓰기를 한다.
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
			//파일의 내용을 읽어서 저장할 배열
			byte[] sourceCode = new byte[(int) orgFile.length()];
			
			//읽어온 byte수를 return
			int cnt = fis.read(sourceCode);
			
			//쓰기
			fos.write(sourceCode, 0, cnt);
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 없습니다. ->" + fnfe.getMessage());
		} catch (IOException ie) {
			System.out.println("입출력 예외발생. ->" + ie.getMessage());
		}
		System.out.println(orgFile.getPath() + "의 내용을 " + tarFile.getPath() + "로 복사하였습니다.");
	}
	
	public static void main(String[] args) {
		new FileCopy().start();
	}
}
