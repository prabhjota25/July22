package jul22.week2.day6;

public class LearnMthodOverloading {
	
	public void savingsAccount(String accountname)
	{
		System.out.println(accountname);
	}
	
	public void savingsAccount(String secondaryaccname, int accnumber)
	{
		System.out.println(secondaryaccname +" "+accnumber);
	}
	
	public void savingsAccount(int accnumber, long accbalance)
	{
		System.out.println(accnumber +" "+accbalance);
	}
	
	public void savingsAccount(int accnumber, String secondaryaccname)
	{
		System.out.println(accnumber +" "+secondaryaccname);
	}


	public static void main(String[] args) {
		LearnMthodOverloading lmo = new LearnMthodOverloading();
		lmo.savingsAccount(10001, "Sudhakar");
		lmo.savingsAccount("Sudhakar");
		lmo.savingsAccount("Sudhakar", 10001);
		lmo.savingsAccount(10001, 100000L);
		
		
	}

}
