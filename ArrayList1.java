package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("nikhil");
		list.add("bansal");
		list.add("sagar");
		list.add("bansal");
		
		for(String item: list) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}

}
