package jul22.week2.day6;

public class ICICIBank extends RBI {
	
	
	public void savingsAccount(String savingsinterest)
	{
		System.out.println(savingsinterest);
	}
	
	public void checkingAccount(int checkinginterest)
	{
		System.out.println(checkinginterest);
	}
	

	public static void main(String[] args) {
		ICICIBank icici = new ICICIBank();
		icici.savingsAccount("5%");
		icici.checkingAccount(7);
		icici.loadAccount(100);

	}

}
