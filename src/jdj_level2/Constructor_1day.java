package jdj_level2;
class hello{
	public hello() {
		System.out.println("생성자부분입니다.");
	}
	public void prn_1() {
		System.out.println("연습입니다.");
	}
}
public class Constructor_1day {
	public static void main(String args[]) {
		hello myhello= new hello();
		myhello.prn_1();
	}

}
