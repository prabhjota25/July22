package jul22.week1.day2;

public class LearnRelationalOperator {

	public int a = 40;
	public int b = 40;
	
	public void lessThan()
	{
		/*if (a<b)
		{
			System.out.println("a is lesser than b");
		}
		
		else if (a>b)
		{
			System.out.println("a is greater than b");
		}
		
		else if (a==b)
		{
			System.out.println("a is equal to b");
		}*/
		
		/*
		 * if (a==b) { System.out.println("a is equal to b"); }
		 * 
		 * else if (a!=b) { System.out.println("a is not equal to b"); }
		 */		
		
		
		  if (a<=b) 
		  { 
			  System.out.println("a is less than or equal to b"); 
		  }
		  
		  else if (a >=b) 
		  { 
			  System.out.println("a is greater than or equal to b"); 
		  }
	}
	
	public static void main(String[] args) 
	{
		LearnRelationalOperator lro = new LearnRelationalOperator();
		lro.lessThan();
		System.out.println(lro.a);
	}
}
