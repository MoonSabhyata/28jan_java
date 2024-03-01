package logicalprogram;

public class imp_armstrong_or_not {

	public static void main(String[] args) {
		int orgnum = 122;
		int sum = 0;
		for(int i=orgnum; i>0; i=i/10)
		{
			int rem = i % 10;
			sum=sum+(rem*rem*rem);
		}
		
		if(orgnum==sum)
		{
			System.out.println("given num " + orgnum + " is armstrong");
		}
		else
		{
			System.out.println("num is not armstrong");
		}
	}
}
