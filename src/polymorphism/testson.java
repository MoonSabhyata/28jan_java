package polymorphism;

public class testson {
 
	public static void main(String[] args) {
		son s1=new son();
		s1.car();
		s1.home();
		s1.bike();
		s1.money();
		System.out.println("--------------");
		father f=new father();
		f.car();
		f.home();
		f.money();
	}
}
