package enumType;

public enum Animal {
	DOG("Fido"), CAT("Kitty"), MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
