package jul22.week1.day2;

public class MyHome {

	private String chairs = "Easy chair";
	private String table = "cofee table";
	public String food = "Dhal curry";
	
	public void bedRoom()
	{
		System.out.println(chairs);
		String bed = "queen";
		System.out.println(bed);
	}
	
	public static void main(String[] args) {
		MyHome sudhakar = new MyHome();
		System.out.println(sudhakar.chairs);
		System.out.println(sudhakar.table);
		sudhakar.bedRoom();
		System.out.println(sudhakar.food);

	}

}
