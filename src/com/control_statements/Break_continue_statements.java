package com.control_statements;

public class Break_continue_statements {

	public static void main(String[] args) {
		
		{for (int i = 0; i < 5; i++) {
			
			if (i==2) {
				
				System.out.println("this statement breaks when it comes 2, so 2 won't be printed");
				
				break;		//it will break the iteration at 2 (0 - 2)
				
			} 
			
			System.out.println(i);
		}}
		
		
		System.out.println("*************************************************************************************");
		
		
		{for (int i = 0; i < 7; i++) {
			
			if (i==4) {
				
				System.out.println("this statement skipped when iteration is at four and continued to print rest of them");
	
				continue;		//it will skip the iteration at 4 (0 - 7 excluding 4)
			}
			
			System.out.println(i);
		}
			
		}
	}

}
