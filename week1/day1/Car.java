package jul22.week1.day1;

public class Car {
		public void drive() {
		System.out.println("Drive the car");
	}
	/*
	 * public void brake() { System.out.println("Apply the Brake"); }
	 * 
	 * public void accelerate() { System.out.println("Applying the acceleration"); }
	 */
	
	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		Car Toyota = new Car();		
		//ObjectName.methodName();
		/*
		 * Toyota.accelerate(); Toyota.brake();
		 */
		Toyota.drive();
		
	}

}
