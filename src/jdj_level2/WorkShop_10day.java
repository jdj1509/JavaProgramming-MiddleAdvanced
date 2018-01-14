package jdj_level2;

public class WorkShop_10day extends Index_10day{
	public WorkShop_10day() {
		System.out.println("워크샵 세미나 예약");
	}
	final int perpeople_drinkcost=7500;
	public long calcdeco_cost() {
		long drinkpay=(people*perpeople_drinkcost)+(people*deco_basic);
		System.out.println("워크샵 테이블 테코레이션 비용="+drinkpay);
		return drinkpay;
	}
	public void calctot_cost() {
		long tot=calcdeco_cost()+(perpeople_cost*people);
		System.out.println("워크샵 총 예상비용="+tot);
	}
}
