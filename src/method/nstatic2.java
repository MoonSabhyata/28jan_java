package method;

public class nstatic2 {
public static void main(String[] args) {
	nstatic2 s1=new nstatic2();
	s1.m1();
	nstatic2 s2=new nstatic2();
	s2.m2();
}
public  void m1() {
System.out.println("non static from same class m1");

}
public void m2() {
	System.out.println("non static from same class m2");
}
}
