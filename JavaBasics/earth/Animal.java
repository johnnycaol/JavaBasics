package earth;

/*
private: only within the class
public: anywhere
protected: within the class/subclass/same package
no modifier: within the class/same package
Make as many as properties and methods as private, only expose those needed public methods (e.g. getters and setters)
*/

public class Animal implements Information {
	protected int numLegs;
	
	public Animal(int numLegs) {
		this.numLegs = numLegs;
	}
	
	public int getNumLegs() {
		return numLegs;
	}

	@Override
	public String getInfo() {
		return "Animal Info.";
	}
}
