package jdj_level2;
import java.util.*;
public class HashSet2_7day {

	public static void main(String[] args) {
		String[] a= {"사과","배","감"};
		Set<String>b=new HashSet<>();
        for(String c:a)
        	b.add(c);
        
        Set<String>Myset=new HashSet<>();
        Myset.add("사과");
        Myset.add("배");
        Myset.add("감");
        Myset.add("감");
        System.out.println("b요소의 코드="+b.hashCode());
        System.out.println("Mya요소의 코드="+Myset.hashCode());
        System.out.println("두 객체가 같은지 여부="+(b==Myset));
        System.out.println("두 객체가 같은지 여부2="+Myset.equals(b));
	}
}
// == : 참조하는 주소가 똑같냐?
// equals : 내용이 똑같냐?		