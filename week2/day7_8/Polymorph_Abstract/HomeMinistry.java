package jul22.week2.day7_8.Polymorph_Abstract;

public abstract class HomeMinistry {
	
	//unimplemented method i.e., no body
	public abstract void budget();
	
	//implemented method
	public void security()
	{
		System.out.println("Securing the country");
	}
	
	public static void main(String[] args) {
		
		//scope restriction
		HomeMinistry hm = new IndGovt();
		hm.security();
		hm.budget();
		
		
	}
	
}
