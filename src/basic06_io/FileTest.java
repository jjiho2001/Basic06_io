package basic06_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		// ����̺�, ����, ���Ͽ� ������ ������ ����ϱ� ���ؼ��� File ��ü�� �����ؾ���.
		/*
		 File(File parent, String child)
		 File(String parent, String child)
		 
		 File (String pathname)
		 */
		try {
			File f1 = new File("C://");
			File f2 = new File("C://Users//Jiho Jung//Desktop/dev/student");
			File f3 = new File("c://Users//Jiho Jung//Desktop/test.txt");
			
			File f4 = new File(f2, "test.txt");
			File f5 = new File("c://User//Jiho Jung//Desktop","text.txt");
			
			// ��� �Ǵ� ���� ���� ����
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			if(!f2.exists()) {
				// mkdir(), mkdirs() : �θ� �� ����;
				if(f2.mkdirs()) {
					System.out.println("������ �����Ǿ����ϴ�");
				} else {
					System.out.println("�������� ����");
				}
			}
			
			// ���� ����
			if(!f4.exists()) {
				if(f4.createNewFile()) {
					System.out.println("���ϰ� �����Ǿ����ϴ�");
				} else {
					System.out.println("���ϰ� �����Ǿ����ϴ�");
				}
			}
			
			long lastDate = f3.lastModified();
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(lastDate);
			
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastDateStr = fmt.format(date.getTime());
			
			System.out.println("������ ���� �� ->" + lastDateStr);
			
			// Ư������̺꿡 �ִ� ������ ���ϸ���� ���Ѵ�.
			File[] files = f1.listFiles();
			// getName() : ���ϸ�
			// getParent() : ���(���ϸ� X)
			// getPath() : ���
			for(File f : files) {
				if(f.isDirectory()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					} else {
						System.out.println(f.getPath() + "[����]");
					}
				} else if(f.isFile()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					} else {
						System.out.println(f.getPath() + "[����]");
					}
				}
			}
			
			// ����̺� ���
			File drive[] = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			long fileSize = f3.length();
			System.out.println("fileSize => " + fileSize);
			
			boolean boo = f3.delete();
			System.out.println(boo);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		new FileTest().start();

	}

}
