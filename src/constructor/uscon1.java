package constructor;

public class uscon1 {
	int num1;
	int num2;
	
	 uscon1()
	 {
		  num1=10;
		  num2=20;
	 }
	 public static void main(String[] args) {
		uscon1 s1=new uscon1();
		s1.addition();
		s1.multiplication();
		
		System.out.println("---------------------");
		 
		udcon2 d1=new udcon2();
		d1.substraction();
		d1.division();
	}
	 public void addition() {
		 System.out.println(num1+num2);
		
	}
	 public void multiplication() {
		System.out.println(num1*num2);
	}
	 

}
