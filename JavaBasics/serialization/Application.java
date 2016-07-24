package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

class Machine implements Serializable {//This allows this class to be serializable

	private static final long serialVersionUID = 438155811971961662L;//this id is used to unserialize the serialized objects
	private int id;//if declared as private transient int id, this field will not be serialized
	private String type;//Static property should not be serialized
	
	public Machine(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public String start() {
		return "Machine started.";
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}

}

public class Application {

	public static void main(String[] args) {
		Machine machine1 = new Machine(1, "auto");
		Machine machine2 = new Machine(2, "manual");

		// Serialize one object
		try {
			// save to a binary file
			FileOutputStream fos = new FileOutputStream("machine.bin");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(machine1);
			os.writeObject(machine2);
			
			fos.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Unserialize one object
		try {
			// save to a binary file
			FileInputStream fis = new FileInputStream("machine.bin");
			ObjectInputStream os = new ObjectInputStream(fis);
			
			Machine machinea = (Machine) os.readObject();
			Machine machineb = (Machine) os.readObject();
			System.out.println(machinea);
			System.out.println(machineb);
			
			fis.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Serialize/Unserialize an array of serializable objects
		Machine[] machines = {new Machine(3, "semi-auto"), new Machine(4, "auto")};
		ArrayList<Machine> machineList = new ArrayList<Machine>(Arrays.asList(machines));
		
		try {
			// save to a binary file
			FileOutputStream fos = new FileOutputStream("machines.bin");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(machines);//Array
			os.writeObject(machineList);//ArrayList
			os.writeInt(machineList.size());//Write one by one
			for(Machine machine: machineList){
				os.writeObject(machine);
			}
			
			fos.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			// save to a binary file
			FileInputStream fis = new FileInputStream("machines.bin");
			ObjectInputStream os = new ObjectInputStream(fis);
			
			Machine[] machines1 = (Machine[]) os.readObject();//Array
			ArrayList<Machine> machineList1 = (ArrayList<Machine>) os.readObject();//ArrayList
			
			for(Machine machine: machines1) {
				System.out.println(machine);
			}
			
			for(Machine machine: machineList1) {
				System.out.println(machine);
			}
			
			int num = os.readInt();//Read one by one
			for(int i=0; i<num; i++) {
				Machine machine = (Machine)os.readObject();
				System.out.println(machine);
			}
			
			fis.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
