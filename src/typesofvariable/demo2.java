package typesofvariable;

public class demo2 {

	static int a=10;
	public static void main(String[] args) {
		System.out.println(a);
		demo2.m1();
		demo2 s1 =new demo2();
		s1.m2(); 
	}
	public static void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(a);
	}
}
