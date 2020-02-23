package collectionframework;

import java.util.TreeSet;

public class ReverseTreeSetElements {

	public static void main(String[] args) {
		
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("nikhil");
		tset.add("bansal");
		tset.add("the");
		
		tset.forEach(element -> {System.out.println(element);});
		
		TreeSet<String> reversedTset = (TreeSet<String>)tset.descendingSet();
		System.out.println("Reversed Values are:::");
		reversedTset.forEach(element -> {System.out.println(element);});
	}

}
