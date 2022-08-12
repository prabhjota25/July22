package jul22.week2.day7_8.Polymorph_Abstract;

public class HDFC extends RBI {

	public void savingsAccount(String savingsinterest)
	{
		System.out.println(savingsinterest);
	}
	
	public void checkingAccount(int checkinginterest)
	{
		System.out.println(checkinginterest);
	}
	
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.savingsAccount("20%");
		hdfc.checkingAccount(15);
	}

}
