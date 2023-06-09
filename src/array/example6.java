package array;

public class example6 {
 public static void main(String[] args) {
	int ar[] []= new int [2][3];
	ar[0][0]=10;
	ar[0][1]=30;
	ar[0][2]=70;
	ar[1][0]=50;
	ar[1][1]=40;
	ar[1][2]=20;
	
	System.out.println(ar.length);
	System.out.println(ar[1][1]);
	for(int i=0; i<=1; i++)
	{
		for(int j=0; j<=2; j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
}
}
