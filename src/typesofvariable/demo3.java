package typesofvariable;

public class demo3 {
static int b=22;
public static void main(String[] args) {
	demo3.m1();
	demo3 g1=new demo3();
	g1.m2();
	System.out.println(demo4.c);
}
public void m2() {
	System.out.println(b);
}
public static void m1() {
	System.out.println(b);
}
}
