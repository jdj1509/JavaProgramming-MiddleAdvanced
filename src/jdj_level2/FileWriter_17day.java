package jdj_level2;
import java.io.File;
import java.io.FileWriter;
public class FileWriter_17day {
	public static void main(String[] args) {
		//파일 출력하기
		String a;
		try {
			File f=new File("d:/Test1.txt"); //d드라이브에 Test1이라는 txt파일을 만든다
			FileWriter fw=new FileWriter(f);
			fw.write("테스트,테스트");          //Test1파일의 출력할 내용
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
