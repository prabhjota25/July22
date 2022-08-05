package jul22.week1.day4;

public class LeanHowToGetOutputFromMethod {
	
	//void - return type
	public float employee()
	{
		return 10.00f;
	}

	public static void main(String[] args) {
		LeanHowToGetOutputFromMethod lhtgofm = new LeanHowToGetOutputFromMethod();
		
		float f= lhtgofm.employee();
		System.out.println(f);

	}

}
