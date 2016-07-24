package equalMethod;

class Machine {
	private int id;
	private String type;
	
	public Machine(int id, String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Machine machine2 = new Machine(1, "auto");
		
		if (machine1 == machine2) {//check if they reference the same objects
			System.out.println("They reference the same object.");
		} else {
			System.out.println("They reference different objects.");
		}
		
		if (machine1.equals(machine2)) {
			System.out.println("The values of the objects are the same.");
		} else {
			System.out.println("The values of the objects are different.");
		}
		
		machine2 = machine1;
		if (machine1 == machine2) {//check if they reference the same objects
			System.out.println("They reference the same object.");
		} else {
			System.out.println("They reference different objects.");
		}
		
		// Another example, data type objects
		Double double1 = 6.3;
		Double double2 = 6.3;
		if (double1 == double2) {
			System.out.println("These two doubles reference the same object.");
		} else {
			System.out.println("These two doubles reference different objects.");//returns this, as they reference different objects
		}
		
		if (double1.equals(double2)) {
			System.out.println("These two doubles have same values.");//returns this, as their values are the same
		} else {
			System.out.println("These two doubles have different values.");
		}
		
		Integer integer1 = 5;
		Integer integer2 = 5;
		if (integer1 == integer2) {
			System.out.println("These two integers reference the same object.");//returns this, as they reference the same object
		} else {
			System.out.println("These two integers reference different objects.");
		}
		
		if (integer1.equals(integer2)) {
			System.out.println("These two integers have same values.");//returns this, as they reference the same object
		} else {
			System.out.println("These two integers have different values.");
		}
		
		String string1 = "Hello";
		String string2 = "HelloWorld".substring(0, 5);
		if (string1 == string2) {
			System.out.println("These two strings reference the same object.");
		} else {
			System.out.println("These two strings reference different objects.");//returns this, as they reference different objects
		}
		
		if (string1.equals(string2)) {
			System.out.println("These two strings have same values.");//returns this, as they reference the same object
		} else {
			System.out.println("These two strings have different values.");
		}
		
		//Summary: 
		// == only checks if two objects reference the same object
		// equals() checks if the values of the two objects are the same
		
		
	}

}
