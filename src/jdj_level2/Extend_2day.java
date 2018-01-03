package jdj_level2;
class super_sample
{
	private String irum;
	public super_sample(){
		System.out.println("슈퍼클래스.");
	}
	public super_sample(String irum){
		this.irum=irum;
		System.out.println(irum+"님 안녕하세요.");
	}
	
	public void roan_info(String place_in){
		if (place_in=="복숭아" || place_in=="딸기" || place_in=="수박")
			System.out.println("과일");
		else
		   System.out.println(irum+"님.");
	}
}

class child_sample extends super_sample{	
	public child_sample(){ 
		//super(); 
		System.out.println("서브클래스.");
	}
	public child_sample(String irum){ 
		super(irum);
		System.out.println("t11");
	}
	
}
public class Extend_2day {
public static void main(String[] args)
{
	child_sample mychild=new child_sample();
	child_sample mychild1=new child_sample("Test");
	mychild.roan_info("복숭아");
	mychild1.roan_info("바나나");
}
}
