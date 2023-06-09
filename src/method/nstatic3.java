package method;

public class nstatic3 {
	public static void main(String[] args) {
		System.out.println("hello non static method call from same class");
		nstatic3 g1=new nstatic3();
		g1.sabbu();
		nstatic3 v1=new nstatic3();
		v1.sabbu1();
		nstatic3 d1=new nstatic3();
		d1.main1();
	}
public void sabbu() {
	System.out.println("hello sabbu");
}
public void sabbu1() {
	System.out.println("hello sabbu1");
	
}
public void main1() {
	System.out.println("hi main");
}
}
