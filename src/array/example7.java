package array;

import java.util.Arrays;

public class example7 {
public static void main(String[] args) {
	int ar[][]= {{20,10,60},{35,25,70}};
	//  0  1  2
	//0 20,10,60
	//1 35,25,70
	
	ar[0][0]=20;
	ar[0][1]=10;
	ar[0][2]=60;
	ar[1][0]=35;
	ar[1][1]=25;
	ar[1][2]=70;
	
	
	System.out.println(ar.length);
	
	
	System.out.println("print all info");
	
	for(int i=0; i<=1; i++)
	{
		for(int j=0; j<=2; j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	Arrays.sort(ar);
	
	for(int i=0; i<=1; i++)
	{
		for(int j=0; j<=2; j++)
		{
			System.out.print(ar[i][j]);
		}
		System.out.println();
	}
	System.out.println("----------------");
	
	for(int i=1; i>=0; i++)
	{
		for(int j=2; j>=0; j++)
		{
			System.out.print(ar[i][j]);
		}
		System.out.println();
	}
	
}
}
