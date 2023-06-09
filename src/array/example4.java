package array;

public class example4 {
public static void main(String[] args) 
{
  int ar[]= {60 ,20,30,10,50};
  System.out.println(ar.length);
  System.out.println(ar[3]);
  System.out.println("--------rint all data");
  
  for(int i=0; i<=ar.length-1; i++)
  {
	  System.out.println(ar[i]);
  }
  
  System.out.println("---------------");
  for(int i=ar.length-1; i>=0; i--)
  {
	  System.out.println(ar[i]);
  }
}
}
