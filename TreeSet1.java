package collections;

import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<String> hset = new TreeSet<String>();
		hset.add("a");
		hset.add("v");
		hset.add("c");
		hset.add("d");
		hset.add("c");
		
		Iterator<String> itr = hset.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
