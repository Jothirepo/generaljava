package static_methods;

import java.util.Scanner;

public class Scanner_type {

	public static void main(String[] args) {

		Scanner yu = new Scanner(System.in);

		String employee_details = yu.nextLine();
		System.out.println("details = " + employee_details);

		String name = yu.next();
		System.out.println("name = " + name);
		
		String designation = yu.next();
		System.out.println("designation = " + designation);
		
		int employee_id = yu.nextInt();
		System.out.println("id = " + employee_id);
		
		float salary = yu.nextFloat();
		System.out.println("salary = " + salary);
		
	}
}
