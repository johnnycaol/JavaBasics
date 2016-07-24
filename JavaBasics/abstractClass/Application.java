package abstractClass;

//interface->abstract class->actual class (usually use abstract to implement one or multiple interfaces)
//an interface tells other developers that what the available public functions can be used in their program
//an interface can be share by different classes (machine, person, color, URL, etc)
//an abstract class is basically an identity of its sub classes
//a class can implements multiple interfaces (all public functions in the interface need to be implemented), but can only have one super/abstract class (only those abstract functions need to be implemented)

abstract class Machine {
	private int id;
	
	public void setId(int id) {//abstract class CAN have default method implementations
		this.id = id;
	}
	
	public int getId(int id) {
		return id;
	}
	
	public abstract void start();//abstract class CAN also have abstract methods to force its sub classes to implement
	
}

class Camera extends Machine {//a car is a machine

	@Override
	public void start() {//abstract class's sub class has to implement abstract functions, but other function are not necessarily needs to be overrided 
		System.out.println("Camera started.");
	}
	
}

class Phone extends Machine {

	@Override
	public void start() {
		System.out.println("Phone started.");
	}
	
}

public class Application {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.setId(1);
		
		Phone phone = new Phone();
		phone.setId(2);
		
		//Machine machine = new Machine();//both abstract classes and interfaces cannot be instantiated
	}
}
