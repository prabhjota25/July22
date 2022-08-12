package jul22.week2.day7_8.Polymorph_Abstract;

public class IndGovt extends FinanceMinistry implements Mobile
{
	
	public static void main(String[] args)
	{
		IndGovt ig = new IndGovt();
		ig.disasterLoan();
		ig.budget();
		ig.goldLoan();
		ig.security();
		ig.takeVideo();
		ig.touchScreen();
	}

	@Override
	public void disasterLoan() {
		System.out.println("THis is disasterLoan");		
	}

	@Override
	public void budget() {
		System.out.println("This is budget");
		
	}

	public void takeVideo() {
		System.out.println("THis is takeVideo");
		
	}

	public void touchScreen() {
		System.out.println("THis is touchScreen");
		
	}

}
