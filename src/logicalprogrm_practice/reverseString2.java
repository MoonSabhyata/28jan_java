package logicalprogrm_practice;

public class reverseString2 {
public static void main(String[] args) {
	String org="moon";
	String rev = "";
	
	for(int i=org.length()-1; i>=0; i--)
	{
		rev=rev+ org.charAt(i);
	}
	System.out.println(rev);
}
}
