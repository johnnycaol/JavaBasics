package passingByValue;

class Machine {

	private int id;
	private String type;
	
	public Machine(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}
	
}

public class Application {

	public static void main(String[] args) {
		Machine machine = new Machine(1,"manual");
		System.out.println("1. Machine is " + machine);
		
		show(machine);
		
		System.out.println("5. Machine is " + machine);
	}
	
	public static void show(Machine machine) {//pass the address(value) to function variable: machine
		System.out.println("2. Machine is " + machine);
		
		machine.setType("auto");
		
		System.out.println("3. Machine is " + machine);
		
		machine = new Machine(2, "semi-auto");//set a new address to function variable: machine
		
		System.out.println("4. Machine is " + machine);
	}
	
}
