package jdj_level2;
import java.util.*;

public class ArrayListClass_5day {
	public static void main(String[] args) {
		ArrayList<String> Mylist=new ArrayList<>();
		Mylist.add("안녕");
		Mylist.add("하");
		Mylist.add("세요");
		System.out.println(Mylist);          //집합
		System.out.println(Mylist.get(1));   
		System.out.println("현재 저장사이즈="+Mylist.size());
		Mylist.add("바나나");
		Mylist.add(2,"키위");
		System.out.println(Mylist);
		System.out.println("현재 저장사이즈="+Mylist.size());
		Mylist.remove("키위");       //키위를 지운다.
		System.out.println(Mylist);
		Mylist.set(2, "이름");       //2번째를 수정한다.
		System.out.println(Mylist);
//		for(int i=0;i<Mylist.size();i++) {
//			System.out.println(Mylist.get(i)+"/");
//		}
//		for(String a : Mylist)
//			System.out.println(a +"/");
//		Iterator<String> itrinfo=Mylist.iterator();
//		while(itrinfo.hasNext())
//			System.out.println(itrinfo.next());
		
	}
}
