package jdj_level2;
import java.util.*;
public class HashSet1_7day {
	public static void main(String[] args) {
		Set<String>a=new HashSet<>();
		a.add("바나나");
		a.add("배");
		a.add("사과");
		a.add("사과");
		System.out.println("항목="+a);
		System.out.println("원소개수="+a.size());
		if(a.contains("바나나")==true)
			System.out.println("바나나는 존재하는 항목입니다.");
	}
}
//HashSet은 중복을 허용하지 않는다.