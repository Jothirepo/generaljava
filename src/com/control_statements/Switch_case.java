package com.control_statements;

public class Switch_case {

	String hero = "captain america";
	
	public void heroornot () {
		
		switch (hero) {									//variable
		case "captain america":							//condition declared
			System.out.println(" yes captain america is a superhero !!");
			break;
		case "super man":
			System.out.println("it is super man");
		case "bat man":
			System.out.println("it is bat man");

		default:
			System.out.println(hero + " is the superhero i thought of");
		}
	}
	
	private void heroname() {
		
		switch (hero) {
		case "thor":
			System.out.println("it's thor !!");
			break;

		default:
			
			System.out.println("i wanted hulk");
			break;
		} 

	}
	
	public static void main(String[] args) {
		
		Switch_case a = new Switch_case ();
		a.heroornot();
		a.heroname();
		
	}

}
