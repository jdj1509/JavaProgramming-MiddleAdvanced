package jdj_level2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class BufferedReader_16day {
	public static void main(String[] args) {
		//파일 읽어오기
		String a;
		try {
		File f=new File("d:/Test.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		while((a=br.readLine())!=null) {
			System.out.println(a);
		}
	   }
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
