package jul22.week2.day5;

public class Park {
	
	
	//public accessSepcifier method
	public void park()
	{
		System.out.println("Public Park");
	}
	
	protected void communityPark()
	{
		System.out.println("Community Park");
	}
	
	void swimmingpool()
	{
		System.out.println("Only COmmunity Swimming Pool");
	}
	
	private void electricBoard()
	{
		System.out.println("Electric Board");
	}

	public static void main(String[] args) {
		Park parkemployee = new Park();
		parkemployee.park();
		parkemployee.communityPark();
		parkemployee.swimmingpool();
		parkemployee.electricBoard();
	}

}
