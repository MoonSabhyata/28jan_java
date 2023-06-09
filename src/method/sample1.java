package method;

public class sample1 {
	public static void main(String[] args) {
		System.out.println("morning");
		m1();
		m2();
		sample2.m4();
		sample3.m6();
		sample3.m7(); 
	}
	public static void m1() {
		System.out.println("main from same class");
	}
public static void m2() {
	System.out.println("main from same class m2");
} 
}
