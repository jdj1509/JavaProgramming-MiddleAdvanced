package jdj_level2;
import java.util.*;

public class ArrayListClass_6day {
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
	}
}
