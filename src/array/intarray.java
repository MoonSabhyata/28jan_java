package array;

import java.util.Arrays;

public class intarray {
 public static void main(String[] args) {
	
	 int ar[]=new int[6];
	 ar[0]=40;
	 ar[1]=70;
	 ar[2]=50;
	 ar[3]=55;
	 ar[4]=60;
	 ar[5]=20;
	  System.out.println(ar[1]);
	  System.out.println(ar.length);
	  System.out.println("print all info");
	  
	  
	   for(int i=0; i<=ar.length-1; i++)
	   {
		   System.out.println(ar[i]);
		   
	   }
	   System.out.println("-----------------------------------------------");
	   
		   Arrays.sort(ar);
		   
		   System.out.println( "this is s nmber" +ar[0]);
		   System.out.println(ar[5]);
		   
		   
	  
}
}
