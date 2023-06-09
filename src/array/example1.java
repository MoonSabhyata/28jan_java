









package array;

public class example1 {
	public static void main(String[] args) {
		int ar []=new int[5];
		ar[0]=30;
		ar[1]=50;
		ar[2]=60;
		ar[3]=20;
		ar[4]=10;
		 System.out.println(ar.length);
		 
		 System.out.println("-----------------");
		 
		 for(int i=0; i<=ar.length-1; i++)
		 {
			 System.out.println(ar[i]);
		 }
		System.out.println("------");
		
		for(int i=ar.length-1; i>=0; i-- )
		{
			System.out.println(ar[i]);
		}
	}

}
