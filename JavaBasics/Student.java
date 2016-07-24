
public class Student extends Person {
	protected int grade;
	
	public Student(String firstName, String lastName, int age, int grade) {
		
		//calls super()(i.e. Person()) first by default
		this.grade = grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getFullName() {
		StringBuilder fullname = new StringBuilder();
		return fullname.append(firstName).append(" ").append(lastName).toString();
	}
}
