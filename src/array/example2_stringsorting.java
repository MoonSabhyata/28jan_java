package array;

import java.util.Arrays;

public class example2_stringsorting {
  public static void main(String[] args) {
	int ar[]=new int[4];
	ar[0]=40;
	ar[1]=25;
	ar[2]=23;
	ar[3]=20;
	 
	System.out.println(ar.length);
	System.out.println("--------------------------");
	
	
	Arrays.sort(ar);
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("---------------------------");
	
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
	
}
}
