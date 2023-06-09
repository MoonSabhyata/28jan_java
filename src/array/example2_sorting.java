package array;

import java.util.Arrays;

public class example2_sorting {
	public static void main(String[] args) {
		 
		int ar []= new int[6];
		ar[0]=44;
		ar[1]=25;
		ar[2]=11;
		ar[3]=78;
		ar[4]=33;
		ar[5]=89;
		
		Arrays.sort(ar);
		
		
		System.out.println(ar.length);
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("------------------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		
		}
		
	}

}
