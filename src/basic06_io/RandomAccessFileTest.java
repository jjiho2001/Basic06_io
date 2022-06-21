package basic06_io;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		try {
			// RandomAccessFile : �� ������ �����
			// new RandowAccessFile(file, mode); mode : r-> �б�����, w->��������, rw->�б⾲���� ���
			File f = new File("C://Users/Jiho Jung/Desktop/dev/student/Random.txt");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			//            012345678901234567890
			String str = "JAVA Random Access File Test...";
			raf.writeChars(str);
			
			int dataInt = 1234;
			raf.writeInt(dataInt);
			
			double dataDouble = 89.36;
			raf.writeDouble(dataDouble);
			
			//////////////////////////
			String txt = "�ڹ����α׷���";
			// ��ġ�� �� ������ �̵�
			raf.seek(5);
			raf.writeChars(txt);
			
			
			// �б�
			raf.seek(20);
			byte[] data = new byte[10];
			int cnt = raf.read(data, 0, data.length);
			System.out.println(new String(data));
			
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new RandomAccessFileTest().start();

	}

}
