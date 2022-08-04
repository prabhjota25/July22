package jul22.week1.day3;

public class Android extends Mobile  {

	public void camera()
	{
		System.out.println("Camera");
	}
	
	public static void main(String[] args) {
		Android android = new Android();
		
		android.camera();
		android.messages();
		android.keypad();

	}

}
