package exceptions;

public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String message) {
		System.err.println(message);
	}

}
