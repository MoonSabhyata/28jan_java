package loop_statement;

public class cube1 {
public static void main(String[] args) {
	for(int i=2; i<=10000; i=i*3)
	{
		System.out.println("cube"+i+"="+(i=i*3));
	}
}
}
