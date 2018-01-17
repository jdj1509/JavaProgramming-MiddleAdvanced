package jdj_level2;
import java.time.*;
import java.util.Scanner;
public class Scanner_14day {
	public static void main(String[] args) {
		int y,m,d;
		System.out.println("년도 입력");
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		System.out.println("월입력");
		Scanner scanner2=new Scanner(System.in);
		y=scanner.nextInt();
		System.out.println("일  입력");
		Scanner scanner3=new Scanner(System.in);
		d=scanner.nextInt();
		
		LocalDate mydate=LocalDate.now();
		LocalDate yourdate=LocalDate.of(2017,3,11);
		/*until메소드를 이용한 날짜 차이계산
		Period p=mydate.until(yourdate);*/
		//period의 between메소드를 이용한 날짜 차이계산
		Period p=Period.between(mydate, yourdate);
		System.out.println("년도 차이="+p.getYears());
		System.out.println("개월 차이="+p.getMonths());
		System.out.println("일 차이="+p.getDays());
	}
}
