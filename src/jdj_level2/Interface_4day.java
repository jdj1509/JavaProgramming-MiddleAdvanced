package jdj_level2;
interface Intogether{
	public void info_cost(int type_info);
}
class mng_banquet implements Intogether{
	int inwon;
	private int cost;
	public void info_cost(int type_info) {
		if(type_info==1)
			cost=9000;
		else if(type_info==2)
			cost=15000;
	}
	public void info_prn() {
		System.out.println("가격정보="+inwon*cost);
	}
}



public class Interface_4day {
	public static void main(String[] args) {
		mng_banquet mybanquet=new mng_banquet();
		mybanquet.inwon=5;
		mybanquet.info_cost(2);
		mybanquet.info_prn();
		
	}

}
