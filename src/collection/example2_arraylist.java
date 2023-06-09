package collection;

import java.util.ArrayList;

public class example2_arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
	al.add("firstname:prabhu");
	al.add("lastname:nannaware");
	al.add(92.83f);
	al.add(101);
	al.add('A');
	al.add(null);
	al.add(null);
	
	
	System.out.println(al);
	
	System.out.println(al.size());
	
	System.out.println(al.isEmpty());
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	
	al.add(1,2233 );
	System.out.println(al);
	
	al.remove(1);
	System.out.println(al);
}
}
