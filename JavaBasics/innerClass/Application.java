package innerClass;

class Machine {
	private int id;

	// Case 1: This is an inner class. This class can only be instantiated with
	// the Machine class
	private class Button {
		public void press() {
			System.out.println("Machine #" + id + "'s button is pressed.");
		}
	}

	// Case 2: This is an static inner class. This class cannot access the
	// instance variable 'id', but for some reason, it needs to be grouped
	// within Machine
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Machine(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting Machine #" + id + "...");

		Button button = new Button();
		button.press();

		final String name = "Jack";

		// Case 3: This a class within a function, can reference 1. instance
		// data (e.g. id) and 2. local FINAL variable (e.g. name)
		// No modifier is needed because of this class is always within this
		// function
		class Temp {
			public void temp() {
				System.out.println("Doing something temp for Machine #" + id
						+ ". Employee name: " + name);
			}
		}

		Temp temp = new Temp();
		temp.temp();
	}
}

public class Application {

	public static void main(String[] args) {
		Machine machine = new Machine(2);
		machine.start();

		Machine.Battery battery = new Machine.Battery();
		battery.charge();
	}

}
