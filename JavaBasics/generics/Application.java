package generics;

import java.util.ArrayList;

class Machine {
	
	@Override
	public String toString() {
		return "I'm a machine";
	}

	public String start() {
		return "Machine started.";
	}
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I'm a camera";
	}

	public String start() {
		return "Camera started.";
	}
	
	public String stop() {
		return "Camera stopped.";
	}
}

public class Application {

	public static void main(String[] args) {
		
		///////// Before Java 5 //////////
		ArrayList list = new ArrayList();
		list.add("orange");
		list.add("apple");
		
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		///////// After Java 5 ///////////
		ArrayList<String> strings = new ArrayList<String>(); //generic ArrayList, the type could be any class
		strings.add("cat");
		strings.add("dog");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		// Generics and Wildcards for operation of a list of objects with different types
		ArrayList<Machine> machines = new ArrayList<Machine>(); 
		machines.add(new Machine());
		machines.add(new Machine());
		showList1(machines);
		showList2(machines);
		
		ArrayList<Camera> cameras = new ArrayList<Camera>();
		cameras.add(new Camera());
		cameras.add(new Camera());
		showList1(cameras);
		showList2(cameras);
		showList3(cameras);
		
		// This works, and relatively fast
		cameras.remove(cameras.size()-1);
		
		// Warning! This works, but very slow as it will copy and paste all the elements to fill in the first element
		cameras.remove(0);
	}
	
	private static void showList1(ArrayList<?> list) {// use a wildcard to represent different object types
		for(Object obj: list) {//need to use Object
			System.out.println(obj);
		}
	}
	
	private static void showList2(ArrayList<? extends Machine> list) {//Machine or subclass of Machine only
		for(Machine obj: list) {
			System.out.println(obj.start());
		}
	}
	
	private static void showList3(ArrayList<? super Camera> list) {//Camera or superclass of Camera only
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));//get an element from ArrayList
		}
	}
}
