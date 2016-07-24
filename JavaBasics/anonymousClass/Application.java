package anonymousClass;

class Machine {

	public String start() {
		return "Machine started.";
	}
}

interface Plant {
	public String grow();
}


public class Application {

	public static void main(String[] args) {
		Machine machine = new Machine() {// this is actually a sub class of Machine (Anonymous Class)
			@Override
			public String start() {
				return "Machine starting...";
			}
		};
		
		Plant plant = new Plant() {
			@Override
			public String grow() {
				return "Plant growing...";
			}
		};
	}

}
