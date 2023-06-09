package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import loop_statement.while_loop;

public class example_vector1 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("moon");
	v.add(101);
	v.add('A');
	v.add(null);
	v.add(null);
	v.add(101);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.isEmpty());
	
	
	System.out.println("iterator");
	Iterator itr = v.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(v.get(0));
	System.out.println("listiterato");
	 ListIterator litr = v.listIterator();
	while (litr.hasNext()) {
		System.out.println(litr.next());
		
	}
	System.out.println("emmurate");
	Enumeration emmu = v.elements();
	while(emmu.hasMoreElements()) {
		System.out.println(emmu.nextElement());
	}
	
	System.out.println("for");
	for(int i=0; i<=v.size()-1; i++)
	{
		
		System.out.println(v.get(i));
	}
	System.out.println("for each");
	for(Object v1:v)
	{
		System.out.println(v1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
