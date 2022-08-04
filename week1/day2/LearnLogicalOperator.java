package jul22.week1.day2;

public class LearnLogicalOperator {
	
	public boolean a=true;
	public boolean b=true;
	
	public void addOperator()
	{
		if (a && b == true)
		{
			System.out.println("a and b are true");
		}
		
		else if (a||b == true)
		{
			System.out.println("Either a or b is true ");
		}
		
		else
		{
			System.out.println("Both are not true");
		}
		
		
	}

	public static void main(String[] args) {
		LearnLogicalOperator llo= new LearnLogicalOperator();
		llo.addOperator();

	}

}
