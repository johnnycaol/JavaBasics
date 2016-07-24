package earth;

public class Plant implements Information {
	private Animal animal = new Animal(2);
	
	public int getAnimalNumLegs() {
		
		// This works as nunLegs is protected, and Plant is in the same package with Animal
		// won't work if these two classes are in different packages
		return animal.numLegs;
	}
	
	@Override
	public String getInfo() {
		return "Plant Info.";
	}

}
