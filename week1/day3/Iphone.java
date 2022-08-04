package jul22.week1.day3;

public class Iphone extends Mobile {

	public void touchpad()
	{
		System.out.println("Touchpad");
	}
	
	public static void main(String[] args) {
		Iphone objectIphone = new Iphone();
		objectIphone.touchpad();
		objectIphone.keypad();
		objectIphone.messages();
		

	}

}
