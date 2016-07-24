import earth.Information;
import earth.Plant;//import a class in another package

public class Test3 {

	public static void main(String[] args) {
		
		// Create a new student object (Inheritance)
		Student student1 = new Student("Bob", "Cao", 26, 1000);
		
		int student1Grade = student1.getGrade();
		System.out.println(student1Grade);
		
		int student1Age = student1.getAge();
		System.out.println(student1Age);
		
		String student1FullName = student1.getFullName();
		System.out.println(student1FullName);
		
		Plant plant = new Plant();// create a Plant object called plant (implements Information)
		System.out.println(getOutputInfo(plant));
		System.out.println(plant.getAnimalNumLegs());
	}
	
	private static String getOutputInfo(Information info) {
		return info.getInfo();
	}

}
