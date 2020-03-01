package collectionframework;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee emp) {
	
		if(id > emp.id)
			return 1;
		else if (id<emp.id)
			return -1;
		return 0;
	}	
}

public class TreeSetWithCompareToMethod {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee(1,"abc");
		Employee e2 = new Employee(0,"abc");
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.forEach(emp -> {System.out.println(emp.id);});
	}

}
