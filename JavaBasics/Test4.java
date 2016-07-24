
public class Test4 {

	public static void main(String[] args) {
		
		// Inefficient: because every time it will create a new string object to hold the new content and reassign to info
		String info = "";
		info += "My name is Johnny.";
		info += " ";
		info += "I'm a engineer.";
		
		// Efficient: use StringBuilder instead
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Johnny.");
		sb.append(" ");
		sb.append("I'm a engineer.")
		.append(" Nice to meet you!");//method chain
		
		System.out.println(sb.toString());
	}

}
