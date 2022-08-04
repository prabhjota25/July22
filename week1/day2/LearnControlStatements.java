package jul22.week1.day2;

public class LearnControlStatements 
{
	public static void main(String[] args) 
	{
		
		LearnRelationalOperator lro = new LearnRelationalOperator();
		
		if(lro.a < lro.b)
		{
			System.out.println("a is less than b");
		}
		
		else if (lro.a > lro.b)
		{
			System.out.println("a is greater than b");
		}
		
		else
		{
			System.out.println("a is equal to b");
		}
		
	}

}
