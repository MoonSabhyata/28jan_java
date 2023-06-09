package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import loop_statement.while_loop;

public class example2_arraylist3 {
public static void main(String[] args) {
	
	ArrayList ar=new ArrayList();
	
	ar.add("sabhyata");
	ar.add("prabhu");
	ar.add(101);
	ar.add('A');
	ar.add(203);
	ar.add(45.5f);
	
	System.out.println(ar);
	System.out.println(ar.size());
	
	ar.remove(4);
	System.out.println(ar);
	
	ar.add(2, 289);
	System.out.println(ar);
	
	System.out.println("----------iterator-------");
	
	Iterator s = ar.iterator();
	
	while (s.hasNext())
	{
		System.out.println(s.next());
		
	}
	
	System.out.println("-----------listiterator---------");
	
	ListIterator s1 = ar.listIterator();
	
	while(s1.hasNext())
	{
		
		System.out.println(s1.next());
	
	}
	
	System.out.println("----using forloop----");
	
	for(int i=0; i<=ar.size()-1; i++)
	{
		System.out.println(ar.get(i));
	}
	
	System.out.println("----using for each-----");
	
	for(Object al:ar)
	{
		System.out.println(al);
	}
	System.out.println(ar.size());
	
	ar.clear();
	System.out.println(ar.size());
	
	
	
	
	
	
	
	
	
	
	
}
}
