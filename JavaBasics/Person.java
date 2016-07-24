
public class Person {
	
	// Property (instance variables)
	protected String firstName;
	protected String lastName;
	protected int age;
	protected String email;
	protected static String planet = "Earth"; //define a static variable (belong to the class)
	protected static int count = 0; //define a static variable count, it will be shared among all objects in one thread
	protected static final String KEY_WORD = "person"; //define a static constant
	
	/**
	 * Multiple implementations of the constructor
	 * The name of the constructor always has to be the same with the class
	 * No type is needed for constructor
	 */
	public Person() {
		/*
		 * Call another constructor in a constructor
		 * Needs to be on the first line, "this" means the constructor Person(int age, String name)
		 */
		this("Johnny", "Cao", 18);
	}

	public Person(String firstName, String lastName, int age) {
		count++; //increment count every time create an object
		this.age = age; //"this" is for avoiding ambiguity
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Static method
	 * Static method cannot return instance variables, but instance method can return static variables
	 * Usage 1: If this method doesn't need instance data, then it could be static
	 * Usage 2: Math.PI (return pi)
	 * @return
	 */
	public static String getPlanet() {
		return planet;
	}
	
	/* For Testing an Object (sysout will call toString(), this will overwrite it)
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		//return String.format("%d: %s", id, name);
	}
	*/
}