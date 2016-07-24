package customObjectsInMapsAndSets;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Machine {
	private int id;
	private String type;
	
	Machine(int id, String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}
	
	// The following two functions make sure the map cannot contain the same object as the key, and the set cannot contain the same object
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}

public class Application {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine(1, "auto");
		Machine machine2 = new Machine(2, "semi-auto");
		Machine machine3 = new Machine(3, "manual");
		Machine machine4 = new Machine(2, "semi-auto");
		
		// Map
		Map<Machine, Integer> map = new LinkedHashMap<Machine, Integer>();
		map.put(machine1, 1);
		map.put(machine2, 2);
		map.put(machine3, 3);
		map.put(machine4, 1);
		
		for(Machine key: map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		// Set
		Set<Machine> set = new LinkedHashSet<Machine>();
		set.add(machine1);
		set.add(machine2);
		set.add(machine3);
		set.add(machine4);
		
		for(Machine item: set) {
			System.out.println(item);
		}

	}

}
