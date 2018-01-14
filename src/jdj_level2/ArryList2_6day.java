package jdj_level2;
import java.util.*;
public class ArryList2_6day {
	public static void main(String[] args) {
		//문자배열인 경우 Arraylist 변환
//	String[] a=new String[] {"바나나","사과","블루베리"};
//	List<String> fruit=new ArrayList<>(Arrays.asList(a));
//	System.out.println("리스트변환결과"+fruit);
//	fruit.set(2, "배");  //변경
//	fruit.add(0, "딸기"); //추가
//	System.out.println("수정후리스트변환결과"+fruit);
		int [] b= {10,20,30,40};
		List<Integer> Myb=new ArrayList<>();
		for(int a:b) {                  //참조변수 a생성
			Myb.add(a);                 //a추가
		}
		Myb.add(2,25);
		System.out.println("리스트변환결과"+Myb);			
	}

}
