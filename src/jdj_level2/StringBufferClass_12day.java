package jdj_level2;
public class StringBufferClass_12day {
	public static void main(String[] args) {
		String a="oracle";
		String b="java";
		StringBuffer ab=new StringBuffer();
		ab.append(a);           //추가
		ab.append(b);
		String joinresult=ab.toString();
		System.out.println(joinresult);
	}
}
//StringBuffer=StringBuilder(연산속도가 더 빠름)
//StringBuffer:문자열의 지속적 변경이나 조정 작업 등에 빠르게 동작하기 위한 클래스