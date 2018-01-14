package jdj_level2;
public class StringClass_11day {
	public static void main(String[] args) {
		int result;
		String A="안녕";
		String B="자바";
		String C="자바자바";
		if((result=B.compareTo(C))==0) {
			System.out.println("일치합니다.");
		}
		else {
			System.out.println("불일치합니다. 결과값="+result);
		}
		int i;
		String a="good python program";
		String b=a.substring(5); //a의 다섯번째 문자부터 끝까지 b에 저장.
		String c=a.replaceAll("python", "java");  //문자열 python을 java로 바꾼다
		System.out.println("5번째 이후 문자열="+b);
		System.out.println("변경된 문자열="+c);
		i=c.indexOf('j');               //J라는 문자열을 찾는다.
		if(i==-1) {                
			System.out.println("해당문자가 존재하지 않음.");
		}
		else {
			System.out.println("해당문자가 "+i+"번째 존재합니다.");
		}
	}
}
//String:변경이 불가능한 class이다.
/*String의 주요 메소드
 * compareTo:두 string 객체안의 문자열 비교(=0,>1,<-1)
 * 
 */
