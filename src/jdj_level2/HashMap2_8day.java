package jdj_level2;
import java.util.*;
public class HashMap2_8day {
	public static void main(String[] args) {
		Map<String,Integer>A=new HashMap<>();
		A.put("바나나",1000);
		A.put("사과",2000);
		A.put("딸기",1000);
		A.put("배",3000);
		A.put("감",4000);
		System.out.println("키갑="+A.keySet());
		System.out.println("결과값"+A.entrySet());
		int i=0;
		for(String k:A.keySet()) {
			i=i+1;
			System.out.println(i+"번 상품의 가격정보="+A.get(k));
		}
		Iterator<String> B=A.keySet().iterator();
		while(B.hasNext()) {
			String k=B.next();
			System.out.print("과일명:"+k+" 가격:"+A.get(k));
		}
	}
}
