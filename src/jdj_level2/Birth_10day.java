package jdj_level2;
import java.util.*;
public class Birth_10day extends Index_10day{
	private int cakesize;
	final int persize_cost=2000;
	public Birth_10day() {
		System.out.println("생일파티 예약");
	}
	public void calc_cake(String cakekind) {
		Map<String,Integer>cake=new HashMap<>();
		cake.put("루비", 15);
		cake.put("사파이어", 18);
		cake.put("다이아몬드", 21);
		this.cakesize=cake.get(cakekind);
	}
	public long calcdeco_cost() {
		int cake_cost;
		long cakedeco_cost;
		cake_cost=cakesize*persize_cost;
		cakedeco_cost=cake_cost+(people*deco_basic);
		System.out.println("케익테이블 테코레이션 기본비용="+cakedeco_cost);
        return cakedeco_cost;
	}
	public void calctot_cost() {
		long tot=calcdeco_cost()+(perpeople_cost*people);
		if(people>=15) {
			tot+=30000;
			System.out.println("생일파티 총예상비용(15명이상이면 초과부담3만원 추가)="+tot);
		}
	}
}
