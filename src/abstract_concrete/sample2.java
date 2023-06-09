package abstract_concrete;

public class sample2 extends sample1
{
 public void m3() {
	System.out.println("completed in concret class");
}
 public void m4() {
	System.out.println("completed in concret class");
}
 public static void main(String[] args) {
	sample2 s1=new sample2();
	s1.m1();
	s1.m2();
	s1.m3();
	s1.m4();
}
}
