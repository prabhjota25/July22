package jul22.week1.day4;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		LearnArray objectla = new LearnArray();
		
		//dataType[] variableName = new dataType[length]
		/*
		 * String[] emp = new String[8];
		 * 
		 * emp[0]="Sudhakar"; emp[1]="Kanika"; emp[2]="Sailaja"; emp[3]="Baljot";
		 * emp[4]="Prabhjot"; emp[5]="Sivani";
		 */
		
		
		String[] emp= {"Sudhakar","Kanika","Sailaja","Baljot","Prabhjot","Sivani","Raj","Yugal"};
		
		//length starts from 1, Index starts from 0 -[0]
		/*
		 * System.out.println(emp.length); System.out.println(emp[1]);
		 * 
		 * String lastIndex = emp[(emp.length)-1];
		 * 
		 * System.out.println(name);
		 */
		
		//Below syntax would get sorting in ascending order
		Arrays.sort(emp);
		
		for (int i=emp.length-1; i>=0; i--) 
		{ 
			System.out.println(emp[i]); 
		}
		 
		
	}

}
