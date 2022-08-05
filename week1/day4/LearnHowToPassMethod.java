package jul22.week1.day4;

public class LearnHowToPassMethod {
	
	//AccessSpecifier void methodName(datType variablename)
	public void addition(int n1, int n2)
	{
		int n3=n1+n2;
		System.out.println(n3);
	}
	
	public static void main(String[] args) {
		LearnHowToPassMethod objectlhtpm = new LearnHowToPassMethod();
		objectlhtpm.addition(10,20);

	}

}
