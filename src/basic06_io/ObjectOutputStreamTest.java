package basic06_io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
// 파일로 객체를 저장하기 위해서는 저장할 클래스를 직렬화해야 함
// interface Serializable 상속하면 됨
import java.util.Calendar;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		
	}

	void start() {
		// 객체를 파일로 쓰기
		Calendar now = Calendar.getInstance();
		MemberVO vo = new MemberVO(1000, "홍길동", "기획부", "010-1111-1111");
		
		// 년도 변경
		now.set(2000, 10, 15);
		vo.setUsername("이순신");
		
		try {
		// 파일로 객체 저장
		File f = new File("C://Users/Jiho Jung/Desktop/dev/student/object.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(now);
		oos.writeObject(vo);
		
		oos.close();
		fos.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new ObjectOutputStreamTest().start();

	}

}
