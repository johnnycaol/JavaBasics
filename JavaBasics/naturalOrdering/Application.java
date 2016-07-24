package naturalOrdering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person person) {
		return name.compareTo(person.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Application {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();//unsorted
		SortedSet<Person> set = new TreeSet<Person>();//sorted, cannot add to tree set unless the natural order is defined
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		showElements(set);

	}
	
	private static void addElements(Collection<Person> collection) {//Collection is an interface
		collection.add(new Person("Johnny"));
		collection.add(new Person("Alex"));
		collection.add(new Person("Sharon"));
		collection.add(new Person("Peter"));
		collection.add(new Person("Kitty"));
	}
	
	private static void showElements(Collection<Person> collection) {
		for(Person element: collection) {
			System.out.println(element);
		}
	}
	
}
