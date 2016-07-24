package recursion;

public class Application {

	public static void main(String[] args) {
		
		// e.g. Factorial: 4! = 4*3*2*1
		System.out.println(getFactorial(4));
	}
	
	public static int getFactorial(int i) {
		
		// The base case
		if (i == 1) {
			return 1;
		}
		
		// The recursive function
		return i*getFactorial(i-1);
	}
	
	//Note about recursion: always use for small numbers otherwise there will be stackoverflow error

}
