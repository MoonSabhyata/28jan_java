package logicalprogram;

public class imp_reversenumber_without_string_function {
public static void main(String[] args) {
	//int rem = num%10; to get last number
		//num=num/10;  remove last number
		
	
	int num = 235;
	 int revnum = 0;
	 
	 for(int i=num; i>0; i=i/10)
	 {
		 int rem = i % 10;
		  revnum = revnum * 10 + rem;
	 }
	System.out.println(revnum);	
	
}
}
