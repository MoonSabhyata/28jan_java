package method;

public class methwparameter1 {
public static void main(String[] args) {
	addition(20,20);
	addition(20,10);
	methwparameter1 sabbu=new methwparameter1();
	sabbu.math(9,3);
}
public static void addition(int num1,int num2) {
	System.out.println(num1+num2);
	System.out.println(num1-num2);
}
public void math(int num3 ,int num4) {
	System.out.println(num3*num4);
}
}
