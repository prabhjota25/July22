package jul22.week2.day7_8.Polymorph_Abstract;

public class NewDevice implements Ipad, Mobile  {

	public static void main(String[] args) {
		NewDevice nd = new NewDevice();
		nd.touchScreen();
		nd.touchPen();
		nd.takeVideo();
	}

	public void touchScreen() {
		System.out.println("This is touchScreen");
	}

	public void touchPen() {
		System.out.println("This is touchPen");
		
	}

	public void takeVideo() {
		System.out.println("This is takeVideo");
		
	}

}
