package jul22.week1.day1;

public class Bus{

	//GlobalVariable
	String color ="Red";
	
	public void driveBus()
	{
		//localVariable
		String color = "Black";
		System.out.println(color);
		System.out.println("Drive Bus");
	}
	
	public void applyBrake()
	{
		//localVariable
		String color ="Yellow";
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		Bus MyBus = new Bus();
		MyBus.driveBus();
		MyBus.applyBrake();
		System.out.println(MyBus.color);
	}

}
