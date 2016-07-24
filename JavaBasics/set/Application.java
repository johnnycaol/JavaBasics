package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		//A set only stores unique items
		Set<String> set1 = new HashSet<String>();//HashSet doesn't retain order
		Set<String> set2 = new LinkedHashSet<String>();//LinkedHashSet retain the (input) order
		Set<String> set3 = new TreeSet<String>();//TreeSet sorts items in natural order 
		
		set1.add("dog");
		set1.add("cat");
		set1.add("fish");
		set1.add("dog");
		set1.add("dog");
		set1.add("dog");//add duplicated items does nothing
		
		set2.add("dog");
		set2.add("cat");
		set2.add("fish");
		
		set3.add("dog");
		set3.add("cat");
		set3.add("fish");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);

		//Iteration of a Set
		for(String item: set1) {
			System.out.println(item);
		}
		
		if(set1.contains("frog")) {
			System.out.println("Contains frog.");
		} else {
			System.out.println("Does not contain frog.");
		}
		
		set1.retainAll(set2);//intersection
		set1.removeAll(set2);//difference
	}

}
