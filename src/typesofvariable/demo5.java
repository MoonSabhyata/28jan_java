package typesofvariable;

public class demo5 {
	int s=45;
	public static void main(String[] args) {
		demo5 d3=new demo5();
		System.out.println(d3.s);
		d3.m1();
		demo6 f3=new demo6();
		System.out.println(f3.d);
		demo5.m2();
		
	}
	public void m1() {
		System.out.println(s); 
		
	}
	public static void m2() {
		demo5 d4 =new demo5();
		System.out.println(d4.s);
		
	}

}
