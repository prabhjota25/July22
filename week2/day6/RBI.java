package jul22.week2.day6;

public class RBI {

	public void savingsAccount(String savingsinterest)
	{
		System.out.println(savingsinterest);
	}
	
	public void checkingAccount(int checkinginterest)
	{
		System.out.println(checkinginterest);
	}
	
	public void loadAccount(int loaninterest)
	{
		System.out.println(loaninterest);
	}
	
	
	public static void main(String[] args) 
	{
		RBI rbi = new RBI();
		rbi.savingsAccount("10%");
		rbi.checkingAccount(12);
	}

}
