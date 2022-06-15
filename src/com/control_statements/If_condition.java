package com.control_statements;

public class If_condition {
	
	public void if_class () {
		
		int b = 20;
				
		if (b < 10) {
			
			System.out.println("condition met");
		}
		
		else if (b > 20) 
		{
			System.out.println("condition satisfied");
		}
		
		else if (b < 18)
		{
			System.out.println("it is less than 18");
		}
		
		else { 
			System.out.println("value is within the range 10 to 20");
		}
		
		}
		

	public static void main(String[] args) {
		
		If_condition e = new If_condition ();
		
		e.if_class();
		

	}

}
