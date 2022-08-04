package jul22.week1.day2;

public class LearnOperators {

	//Global Variable
	//Syntax = AccessSpecifier dataType variableName = value;
	
	public int a = 30;
	public int b = 20;
	
	  public void addition() 
	  { 
		  //local variable
		  //int a = 10; 
		  //int b = 20; 
		  int sum = a+b;
		  System.out.println("The addition of 2 number is :" + sum);
	  }
	  
	  public void subtraction()
	  {
		  //int c=20;
		 // int d=10;
		  int minus = a-b;
		  System.out.println("The subtraction of 2 number is :" + minus);
	  }
	  
	  public void multiplication()
	  {
		  int multiplication =a*b;
		  System.out.println("The mulitplication of 2 number is :" + multiplication);
	  }
	  
	  public void division()
	  {
		  System.out.println("The divison of 2 number is :" + a/b);
	  }
	 
	  public void mod()
	  {
		  System.out.println("The mod of 2 number is :" + a%b);
		  
		  int value1 = 3;
		  int value2 = 3;
		  System.out.println("The mod of 2 number is :" + value1%value2);
	  }
	
	public static void main(String[] args) {
		LearnOperators le = new LearnOperators();
		//System.out.println(le.sum);
		le.addition();
		le.subtraction();
		le.multiplication();
		le.division();
		le.mod();
		

	}

}
