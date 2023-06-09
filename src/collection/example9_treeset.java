package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example9_treeset {
public static void main(String[] args) {
	TreeSet tr=new TreeSet();
	tr.add(101);
	tr.add(102);
	tr.add(103);
	tr.add(104);
	tr.add(104);
	tr.add(105);
	
	
	System.out.println(tr);
	System.out.println(tr.size());
	System.out.println(tr.isEmpty());
	tr.remove(105);
	System.out.println(tr);
	
	System.out.println("-------iterator--------");
	Iterator itr = tr.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("------for each----");
	for(Object tr1:tr)
	{
		System.out.println(tr1);
	}
	
}
}
