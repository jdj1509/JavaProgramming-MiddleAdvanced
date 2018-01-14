package jdj_level2;
import java.util.Scanner;
public class Main_10day {

	public static void main(String[] args) {
		int gubun,person;
		String cakekind;
		System.out.println("예약하실 연회의 종류를 선택하세요.(1.워크샵/세미나, 2.생일파티/기념일)");
		Scanner scanner=new Scanner(System.in);
		gubun=scanner.nextInt();
		System.out.println("모임인원을 입력하세요.");
		Scanner scanner1=new Scanner(System.in);
		person=scanner1.nextInt();
		if (gubun==1) {
			WorkShop_10day myworkshop=new WorkShop_10day();
			myworkshop.set_people(person);
			myworkshop.calctot_cost();
		}
		else if(gubun==2) {
			System.out.println("사용하실 케익의 종류를 선택하세요.(루비/사파이어/다이아몬드)");
			Scanner scanner2=new Scanner(System.in);
			cakekind=scanner2.next();
			Birth_10day mybirth=new Birth_10day();
			mybirth.set_people(person);
			mybirth.calc_cake(cakekind);
			mybirth.calctot_cost();
		}
	}

}
