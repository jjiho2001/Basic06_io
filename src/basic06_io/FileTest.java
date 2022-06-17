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
		// 드라이브, 폴더, 파일에 관련한 정보를 사용하기 위해서는 File 객체를 생성해야함.
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
			
			// 경로 또는 파일 존재 유무
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			if(!f2.exists()) {
				// mkdir(), mkdirs() : 부모를 더 생성;
				if(f2.mkdirs()) {
					System.out.println("폴더가 생성되었습니다");
				} else {
					System.out.println("폴더생성 실패");
				}
			}
			
			// 파일 생성
			if(!f4.exists()) {
				if(f4.createNewFile()) {
					System.out.println("파일가 생성되었습니다");
				} else {
					System.out.println("파일가 생성되었습니다");
				}
			}
			
			long lastDate = f3.lastModified();
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(lastDate);
			
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastDateStr = fmt.format(date.getTime());
			
			System.out.println("마지막 수정 일 ->" + lastDateStr);
			
			// 특정드라이브에 있는 폴더와 파일목록을 구한다.
			File[] files = f1.listFiles();
			// getName() : 파일명
			// getParent() : 경로(파일명 X)
			// getPath() : 경로
			for(File f : files) {
				if(f.isDirectory()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[숨김폴더]");
					} else {
						System.out.println(f.getPath() + "[폴더]");
					}
				} else if(f.isFile()) {
					if(f.isHidden()) {
						System.out.println(f.getPath() + "[숨김파일]");
					} else {
						System.out.println(f.getPath() + "[파일]");
					}
				}
			}
			
			// 드라이브 목록
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
