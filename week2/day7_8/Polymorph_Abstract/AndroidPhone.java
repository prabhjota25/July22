package jul22.week2.day7_8.Polymorph_Abstract;

public class AndroidPhone implements Mobile {

	public void takeVideo() {
		System.out.println("takeVideo is constructed");
		
	}

	public void touchScreen() {
		System.out.println("touchScreen is demonstrated");
		
	}
	
	public void textMessage()
	{
		System.out.println("This is test message");
	}
	
	public static void main(String[] args) 
	{
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
		ap.touchScreen();
		ap.textMessage();

	}

	

}
