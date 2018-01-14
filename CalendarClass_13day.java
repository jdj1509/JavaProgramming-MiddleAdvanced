package jdj_level2;
import java.util.Calendar;
public class CalendarClass_13day {
	public static void main(String[] args) {
		int y,m,d;
		Calendar A=Calendar.getInstance();    //new연산자 대신 getInstance 사용.
		y=A.get(A.YEAR);
		m=A.get(A.MONTH);                 //MONTH는 0부터 시작.
		d=A.get(A.DATE);
		System.out.println("현재년도:"+y+"년"+(m+1)+"월"+d+"일");
	}
}
//calendar class:날짜,시간을 제공.
//new연산자를 통해 인스턴스 생성불가=>GetInstance()사용