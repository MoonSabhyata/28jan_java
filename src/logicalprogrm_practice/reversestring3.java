package logicalprogrm_practice;

public class reversestring3 {
public static void main(String[] args) {
	String org="abcd";
	String rev="";
	for(int i=org.length()-1; i>=0; i--)
	{
		rev=rev+org.charAt(i);
	}
	
	System.out.println(rev);
}
	
}
