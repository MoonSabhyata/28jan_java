package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example5_vector {
public static void main(String[] args) {
	Vector v= new Vector();
	v.add("sabhyata");
	v.add("prabhu");
	v.add("made for eachb other");
	v.add(2349);
	v.add(305);
	v.add(null);
	v.add(null);
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	
	v.remove(5);
	System.out.println(v);
	
	v.add(5, 305);
	System.out.println(v);
	
	
	System.out.println("--------litarator-------------");
	ListIterator litr = v.listIterator();
    while (litr.hasNext()) {
		System.out.println(litr.next());
		
	}
    
    System.out.println("-----iterator---");
    Iterator itr = v.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    
    System.out.println("-----forloop----");
     for(int i=0; i<=v.size()-1; i++)
     {
    	 System.out.println(v.get(i));
     }
     
     System.out.println("------for each----");
     for(Object v1:v)
     {
    	 System.out.println(v1);
     }
     
     System.out.println("------emmurates-----");
     
     Enumeration emmu = v.elements();
     while(emmu.hasMoreElements())
     {
    	 System.out.println(emmu.nextElement());
     }
    
    
}
}
