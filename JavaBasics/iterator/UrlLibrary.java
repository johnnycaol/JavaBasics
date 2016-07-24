package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	
	LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary() {
		urls.add("http://www.soapboxhq.com");
		urls.add("http://www.facebook.com");
	}

	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}

}
