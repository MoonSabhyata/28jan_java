package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example7_hashset {
public static void main(String[] args) {
	HashSet hs= new HashSet();
	hs.add("sabbu");
	hs.add("moon");
	hs.add(102);
	hs.add('D');
	hs.add(null);
	hs.add(null);
	hs.add(102);
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.isEmpty());
hs.remove(102);
System.out.println(hs);
	
hs.add(102);
System.out.println(hs);


System.out.println("----iterator----");

Iterator itr = hs.iterator();
while(itr.hasNext())
{
	
	
	System.out.println(itr.next());
	}


System.out.println("------for each------");
for(Object hs1:hs)
{
	System.out.println(hs1);
	}
  


System.out.println(hs.size());

hs.clear();
System.out.println(hs.size());










}
}
