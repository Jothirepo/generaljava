package hierarchial_inheritance;

public class Echo extends Alexa {

	public void echomethod() {
		
		System.out.println("this belongs to echo class (child class)");
	}
	public static void main(String[] args) {

		Alexa a = new Alexa();

		System.out.println("ECHO_DATA");
		a.dolby();
		a.version();
		
	/////////////////////////////////////////////////
		
		Echo e = new Echo();
		e.dolby();
		e.version();
		e.echomethod();
	}
}
