package casting;

class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void stop() {
		System.out.println("Camera stopped.");
	}
}

public class Application {

	public static void main(String[] args) {
		// Up casting for object type
		Machine machine = new Camera();
		machine.start();// "Camera started."
		// Error: type knows what functions are available, object knows the implementation of the function.
		// Since the type is machine, the function stop() is not available
		//machine.stop()
		
		// Down casting for object type
		Camera camera = (Camera) machine;
		camera.start();
		camera.stop();
		
		// Error: cannot downcast an actual objects
		Machine machine1 = new Machine();
		//Camera camera1 = (Camera) machine1;
	}

}
