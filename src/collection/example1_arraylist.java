package collection;

import java.util.ArrayList;

public class example1_arraylist {
public static void main(String[] args) {
	ArrayList s1=new ArrayList();
	s1.add("sabhyata");
	s1.add(101);
	s1.add(5054f);
	s1.add('B');
	s1.add(null);
	s1.add(null);
	s1.add("nagpur");
	
	System.out.println(s1);
	System.out.println(s1.size());
	System.out.println(s1.isEmpty());
	System.out.println(s1.get(0));
	System.out.println(s1.get(4));
	
	s1.add(4, 300);
	System.out.println(s1);
	System.out.println(s1.size());
	s1.add(2, 134);
	System.out.println(s1);
	System.out.println(s1.size());
	s1.remove(2);
	s1.remove(5);
	System.out.println(s1);
	System.out.println(s1.size());
	
	
	
	
}
}
