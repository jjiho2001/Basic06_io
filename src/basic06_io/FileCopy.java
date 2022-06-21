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
			//byte�� ��ŭ �ѹ��� orgFile������ ������ ���� tarFile�� ���⸦ �Ѵ�.
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
			//������ ������ �о ������ �迭
			byte[] sourceCode = new byte[(int) orgFile.length()];
			
			//�о�� byte���� return
			int cnt = fis.read(sourceCode);
			
			//����
			fos.write(sourceCode, 0, cnt);
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �����ϴ�. ->" + fnfe.getMessage());
		} catch (IOException ie) {
			System.out.println("����� ���ܹ߻�. ->" + ie.getMessage());
		}
		System.out.println(orgFile.getPath() + "�� ������ " + tarFile.getPath() + "�� �����Ͽ����ϴ�.");
	}
	
	public static void main(String[] args) {
		new FileCopy().start();
	}
}
