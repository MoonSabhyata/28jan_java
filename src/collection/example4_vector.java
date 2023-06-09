package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import loop_statement.while_loop;

public class example4_vector {
public static void main(String[] args) {
	Vector v=new Vector();
	
	v.add("sabbu");
	v.add("moon");
	v.add(120);
	v.add('c');
	v.add(null);
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	
	v.remove(5);
	System.out.println(v);
	
	v.add(5, 456);
	System.out.println(v);
	
	
	System.out.println("-------iterator------");
	
	Iterator itr = v.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	System.out.println("-----listiterator-----");
	ListIterator lsitr = v.listIterator();
	while(lsitr.hasNext())
	{
		System.out.println(lsitr.next());
	}
	System.out.println("---forloop----");
	
	for(int i=0; i<=v.size()-1; i++)
	{
		System.out.println(v.get(i));
	}
	
	System.out.println("for each");
for(Object v1:v)
{
System.out.println(v1);	
}
	
	System.out.println("------emmurates---");
	Enumeration em = v.elements();
	while(em.hasMoreElements())
	{
		System.out.println(em.nextElement());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
