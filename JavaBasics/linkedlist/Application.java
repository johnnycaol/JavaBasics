package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		//[0][1][2][3][4]...
		ArrayList<Integer> arrayList = new ArrayList<Integer>();//useful if only add/remove items from the END of the list
		
		//[0]->[1]->[2]->[3]->[4]...
		LinkedList<Integer> linkedList = new LinkedList<Integer>();//useful if needs to add/remove items from anywhere of the list
		
		timing("ArrayList", arrayList);
		timing("LinkedList", linkedList);
	}
	
	private static void timing(String type, List<Integer> list) {//List here is just an interface, I can pass in anything that implements List to this method
		long start = System.currentTimeMillis();
		
//		for(int i=0; i<1E5; i++) {
//			list.add(i);//add items to the end of the list
//		}
		
		for(int i=0; i<1E5; i++) {
			list.add(0, i);//add items to the beginning of the list
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken " + (end-start) + " ms for " + type);
	}

}
