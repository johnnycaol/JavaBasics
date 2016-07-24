package complexDataStructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Application {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { 
		{ "Alex", "Peter", "Wang" },
		{ "Sharon", "Johnny", "Kitty" }, 
		{ "Google", "Amazon", "Dropbox" } 
	};

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : drivers[i]) {
				driverSet.add(driver);
			}

			personnel.put(vehicles[i], driverSet);
		}

		Set<String> driversList = personnel.get("helicopter");
		System.out.println(driversList);

	}

}
