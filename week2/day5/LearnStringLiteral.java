package jul22.week2.day5;

public class LearnStringLiteral {
	
	public static void main(String[] args)
	{
		//String Literal
		//dataType variablename = value;
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "welcome";
		String s4 = "welcome";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
