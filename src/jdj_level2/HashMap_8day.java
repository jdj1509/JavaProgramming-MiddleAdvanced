package jdj_level2;
import java.util.*;
public class HashMap_8day {

	public static void main(String[] args) {
		Map<String,Integer>A=new HashMap<>();
		A.put("바나나",1000);
		A.put("사과",2000);
		A.put("딸기",1000);
		System.out.println("과일 목록="+A);
		System.out.println("바나나가격정보="+A.get("바나나"));		
		A.remove("바나나");       //삭제
		System.out.println(A);
	}
}
