package constructor;

public class csample2 {
 int num1;
 int num2;
 csample2(int a,int b)
 {
	 num1=a;
	 num2=b;
 }
 public void add() {
	System.out.println(num1+num2);
}
 public void mul() {
	System.out.println(num1*num2);
}
 public static void main(String[] args) {
	
	 csample2 s1=new csample2(20,30);
		 s1.add();
	     s1.mul();
	     
	  csample2 d1=new csample2(40,30);
	  d1.add();
	  d1.mul();
	  System.out.println("--------------------");
	  
	  csample3 s2=new csample3(40 ,20);
	  s2.sub();
	  s2.sub();
	  
	     
 }
 
 
}
