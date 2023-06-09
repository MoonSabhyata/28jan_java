package array;

public class stringarray {
	public static void main(String[] args)
	{
		String ar[]=new String [5];
		ar[0]="sabhyata";
		ar[1]="honey";
		ar[2]="rachna";
		ar[3]="bhawna";
		ar[4]="prabandha";
		
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar.length);
		System.out.println("print all info from string--------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
		System.out.println(ar[i]);		
				
		}	
	}

}
