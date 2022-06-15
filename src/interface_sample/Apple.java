package interface_sample;

public class Apple implements Amazon, Flipkart {
	
	@Override
	public void brand() {
		
		System.out.println("apple");
	}
	
	@Override
	public void department () {
		
		System.out.println("APPLE_DATA_SERVICES");
	}
	
	@Override
	public void employee () {
		System.out.println("JO");
	}
	
	@Override
	public void device () {
		System.out.println("HOME AUTOMATION");
	}
	
	@Override
	public void device_type () {
		System.out.println("SMART SPEAKER");
	}
	
	public static void main (String[] args) {
		
			Apple   e = new Apple();
		
		//child_class ref = new child class ();	
			
		e.brand();
		e.department();
		e.employee();
		e.device();
		e.device_type();
		
	}
	
}
