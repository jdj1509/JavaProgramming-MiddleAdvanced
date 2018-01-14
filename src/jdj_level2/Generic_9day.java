package jdj_level2;
class MakeGeneric<T>{
	private T object;
	public void makeget() {
		System.out.println("전달받은 값="+this.object);
	}
		public void makeset(T object) {
			this.object=object;
		}
}
public class Generic_9day {

	public static void main(String[] args) {
		MakeGeneric<String>A=new MakeGeneric<>();
		A.makeset("바나나");
		A.makeget();
	}
}
