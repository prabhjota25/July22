package jul22.week1.day4;

public class LearnHowToPassMethodWithMultipleVariables {

	public void employee(String name, int emp_id, float salary)
	{
		System.out.println(name +" "+ emp_id+" "+salary);
	}
	
	public static void main(String[] args) {
		LearnHowToPassMethodWithMultipleVariables objectlw = new LearnHowToPassMethodWithMultipleVariables();
		objectlw.employee("Sudhakar", 100, 1000.00f);
		objectlw.employee("Prabhjot", 101, 1001.50f);
		objectlw.employee("Kanika", 102, 2000.50f);
		

	}

}
