package jdj_level2;
abstract class banquet{
		protected String res_name;
		protected int res_inwon;
		public void res_info(String name, int res_inwon) {
			this.res_name=name;
			this.res_inwon=res_inwon;
		}
		public abstract void tot_pay(int basic_cost, int use_cost);
       }
class birth_party extends banquet {
	public void tot_pay(int basic_cost, int use_cost) {
		int pay_calc=0;   //초기값
		pay_calc=basic_cost*res_inwon+use_cost+20000;
		System.out.println("생일파티기본비용"+pay_calc);
	    }
}
public class Abstract_3day {
	public static void main(String[] args) {
//		banquet Mybanquet=new banquet();          추상클래스는 바로 객체를 생성하지 못한다.
        birth_party Mybirth=new birth_party();
        Mybirth.res_info("홍길동",8);
        Mybirth.tot_pay(18000, 100000);
	}

}

