package jdj_level2;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.*;
public class StringJoiner_12day {
	public static void main(String[] args) {
		StringJoiner a=new StringJoiner("/","(",")").add("사과").add("사과"); 
		                              //구분자 /를 추가,제일앞자리에(,뒷자리에)추가
		a.add("사과");        //요소추가
		a.add("바나나");
		a.add("딸기");
		String result=a.toString();
		//=String result=new StringJoiner("-").add("사과").add("바나나").add("딸기");
		System.out.println("결과는="+result);		
        //기본 join
		String join1=String.join(",", "바나나","딸기","사과");  
		System.out.println("결과="+join1);
		//배열에서 join메소드
		String[] arr= {"사과","바나나","딸기"};
		String A=String.join("/", arr);
		System.out.println("결과="+A);		
	}
}
//StringJoiner:문자열 연결시 구분자를 추가.