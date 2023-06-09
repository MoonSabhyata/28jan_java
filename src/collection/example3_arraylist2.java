package collection;

import java.util.ArrayList;

public class example3_arraylist2 {
public static void main(String[] args)
{
	
	ArrayList Ar=new ArrayList();
	
	Ar.add("sabhyata");
	Ar.add("moon");
	Ar.add(123);
	Ar.add('c');
	Ar.add(123);
	
	
	System.out.println(Ar);
	System.out.println(Ar.size());
	
	
	Ar.remove(2);
	System.out.println(Ar);
	
	
	Ar.add(2, 234);
	System.out.println(Ar);
	
	Ar.add(3,null);
		System.out.println(Ar);
		
		System.out.println("-----iterator------");
		
	
		
		
		
			
	
	
	
}
}
