package polymorphism;

class Machine {
	public String start() {
		return "Machine started.";
	}
}

class Camera extends Machine{
	public String start() {
		return "Camera started.";
	}
	
	public String stop() {
		return "Camera stopped.";
	}
}

class Phone extends Machine{
	public String start() {
		return "Phone started.";
	}
	
	public String stop() {
		return "Phone stopped.";
	}
}

public class Application {

	public static void main(String[] args) {
		Machine machine = new Machine();
		Camera camera = new Camera();
		Phone phone = new Phone();
		System.out.println(start(machine));
		System.out.println(start(camera));
		System.out.println(start(phone));
	}
	
	private static String start(Machine machine) {
		return machine.start();//polymorphism of start()
	}

}
