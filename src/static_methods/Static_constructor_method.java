package static_methods;

public class Static_constructor_method {

	static {

		String x = "amazon";
		String y = "expenses";

		System.out.println("what is this = " + x + " " + y);

	}

	public static void amazon() {

		int a = 10;
		int b = 30;

		System.out.println("total hc = " + (a + b) + " " + "members");
		
		int c = a + b;
		int d = 20;
		int e = c * d;

		System.out.println("Per hour expense = rupees " + e);
		
		float j = e;
		long  h = 23443l;
		
		System.out.println("monthly expenses = " + (h+j));
		
	}
	
	private void conclusion () {
		
		System.out.println("conclusion = " + "expenses are at the bar level");
		
	}
	public Static_constructor_method() {

		String a = "employees_expenses";
		String b = "ads";

		System.out.println("spent on who? = " + a + " from " + b);		
				
	}

	public static void main(String[] args) {

//		Static_constructor_method e = new Static_constructor_method(); {
//			e.amazon();
//			e.conclusion();
//		}
	}

}