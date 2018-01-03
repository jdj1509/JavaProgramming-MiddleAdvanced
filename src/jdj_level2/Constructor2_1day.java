package jdj_level2;
//생성자(constructor)
class info{
	public info(int a,int b) {
		System.out.println("입력한 정보로 셋팅.");
	cost=a;
	people=b;
	}
	public info() {
		System.out.println("안녕하세요!!");
	}
	public info(String irum) {
		System.out.println(irum+"는 200원 입니다.");
	}
	private int cost;
	private int people;
	public void prn_calc()
	{
		System.out.printf("1인당 가격=%d 전체가격=%d\n",cost,cost*people);
	}
}
public class Constructor2_1day
{
public static void main(String[] args) {
	info cost=new info(5000,2);
	info cost1=new info("바나나");
	cost.prn_calc();
}

}

//오버로딩: 생성자,메소드의 매개변수타입(개수)를 다르게 받아 들여서 서로다른 결과를 출력하는 성질
//오버라이딩: 부모 메소드의 형식은 동일하지만 동작만 다르게 실행
