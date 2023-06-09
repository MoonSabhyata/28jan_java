package array;

import java.util.Arrays;

public class example3_Stringsortin {
public static void main(String[] args) {
	String ar[]=new String[4];
	ar[0]="sabbbu";
	ar[1]="prabhu";
	ar[2]="rachna";
	ar[3]="bhawna";
	
	System.out.println(ar.length);
	
	System.out.println("decrement and increment by for loop");
	
	Arrays.sort(ar);
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println(" decrement");
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}	
}
}
