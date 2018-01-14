package jdj_level2;

public abstract class Index_10day {
	public Index_10day() {
		System.out.println("연회전문 예약 서비스");
	}
	protected int people;
	final int perpeople_cost=50000;      //final=고치지못하도록 상수로 만듬
	final int deco_basic=3000;
	
	public void set_people(int people) {
		this.people=people;
	}
	public abstract long calcdeco_cost();
	public abstract void calctot_cost();
}
