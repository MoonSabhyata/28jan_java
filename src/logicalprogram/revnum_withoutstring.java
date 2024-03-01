package logicalprogram;

public class revnum_withoutstring {
public static void main(String[] args) {
	
	int num = 346;
	int revnum = 0;
	
	for(int i=num; i>0; i=i/10)
	{
		int rem = i%10;
		revnum=revnum * 10 +rem;
	}
	System.out.println(revnum);
}
}
