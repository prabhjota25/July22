package jul22.week1.day3;

public class Vehicle {
	
	public void applyBrake()
	{
		System.out.println("ApplyBrake");
	}
	
	public void soundHorn()
	{
		System.out.println("SoundHorn");
	}

	public static void main(String[] args) {
		Vehicle objectVehicle = new Vehicle();
		objectVehicle.applyBrake();
		objectVehicle.soundHorn();

	}

}
