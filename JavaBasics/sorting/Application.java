package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Machine {
	private int id;
	private String type;
	
	Machine(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		} else if(len1 < len2) {
			return -1;
		}
		
		return 0;
	}	
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}

public class Application { 

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("fish");
		
		Collections.sort(animals); 
		Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new AlphabeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		List<Machine> machines = new ArrayList<Machine>();
		machines.add(new Machine(1, "auto"));
		machines.add(new Machine(2, "semi-auto"));
		machines.add(new Machine(3, "manual"));
		
		Collections.sort(machines, new Comparator<Machine>() {
			public int compare(Machine m1, Machine m2) {
				if(m1.getId() > m2.getId()) {
					return 1;
				} else if(m1.getId() < m2.getId()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		for(Machine machine: machines) {
			//...
		}

	}

}
