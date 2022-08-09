package jul22.week2.day5;

public class LearnCharOfOccurence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					int count=0;
					
					// convert the string into char array
					char[] charArray = str.toCharArray();
						
					//System.out.println(charArray[5]);
					
										
					for (int i=0; i<charArray.length; i++)
					{
						
						// Check the char array has the particular char in it
						if (charArray[i]==' ')
							count++;
					}
					
					System.out.println(count);
						
						 
					
											 
						
						

	}

}
