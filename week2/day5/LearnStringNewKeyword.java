package jul22.week2.day5;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnStringNewKeyword {
	
	//Memory for String str1 is stored separately compared against str2
	public String s1()
	{
		String str1="WELCOMEHOME123";
		return str1;
	}
	
	//Memory for String str2 is stored separately compared against str1
	public String s2()
	{
		String str2="Welcome";
		return str2;
	}

	public static void main(String[] args) {
		
		//Declare using new keyword
		LearnStringNewKeyword lsnk = new LearnStringNewKeyword();
		
		String vars1 = lsnk.s1();
		String vars2 = lsnk.s2();
		
		System.out.println(vars1.equals(vars2));
		System.out.println(vars1.equalsIgnoreCase(vars2));
		System.out.println(vars1.charAt(0));
		System.out.println(vars2.charAt(0));
		
		System.out.println(vars1.length());
		System.out.println(vars1.charAt(vars1.length()-1));
		System.out.println(vars1.concat(vars2));
		
		//System.out.println(vars1.compareTo(vars2));
		
		System.out.println(vars1.compareToIgnoreCase(vars2));
		
		System.out.println(vars1.toLowerCase());
		
		System.out.println(vars2.toUpperCase());
		System.out.println(vars1.replace('C', 'S'));
		
		System.out.println(vars1.replaceAll("[COM]", "#"));
		
		
	}

}
