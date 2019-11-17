package collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(1,"Nikhil1");
		map.put(1,"Nikhil2");
		map.put(3,"Nikhil3");
		map.put(4,"Nikhil4");
		map.put(5,"Nikhil5");
		
		System.out.println(map.firstKey());
		System.out.println(map);
		for(Map.Entry<Integer, String> m :map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

}