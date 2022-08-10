package jul22.week2.day6;

public class AndroidPhone implements Mobile {

	public void takeVideo() {
		System.out.println("takeVideo is constructed");
		
	}

	public void touchScreen() {
		System.out.println("touchScreen is demonstrated");
		
	}
	
	public static void main(String[] args) 
	{
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
		ap.touchScreen();

	}

	

}
