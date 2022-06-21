package basic06_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {

	public DataInputOutputStreamTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		// 원래 데이터형으로 파일 읽고 쓰기
		
		try {
			// 파일 쓰기
			int dataInt = 231525;
			double dataDouble = 353.123;
			boolean dataBoolean = true;
			char dataChar = 'z';
			
			File f = new File("C://Users/Jiho Jung/Desktop/dev/student/test.txt");
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
			
			dos.writeInt(dataInt);
			dos.writeDouble(dataDouble);
			dos.writeBoolean(dataBoolean);
			dos.writeChar(dataChar);
			dos.close();
			System.out.println("데이터형으로 파인 쓰기가 완료되었습니다.");
			
			// Data형으로 저장된 데이터 읽어오기
			
			DataInputStream dis = new DataInputStream(new FileInputStream(f));
			
			int readInt = dis.readInt();
			double readDouble = dis.readDouble();
			boolean readBoolean = dis.readBoolean();
			char readChar = dis.readChar();
			
			System.out.println("int -> " + readInt);
			System.out.println("double -> " + readDouble);
			System.out.println("boolean -> " + readBoolean);
			System.out.println("char -> " + readChar);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DataInputOutputStreamTest().start();
	}

}
