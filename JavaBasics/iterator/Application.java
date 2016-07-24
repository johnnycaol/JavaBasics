package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("cat");
		list.add("dog");
		list.add("rabbit");
		
		// for each actually implements the following behind the scene:
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String url: urlLibrary) {
			System.out.println(url);
		}

	}

}
