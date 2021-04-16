package lab_2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Number of males in class:");
		int male =sc.nextInt();

		System.out.println("Number of females in class:");
		int female =sc.nextInt();
		
		int sum= female+male;

		int percentageOfFemale = (female*100)/sum;
		int percentageOfMale = (male*100)/sum;
		
		System.out.println("Percentage of males in class is:" + percentageOfMale);
		System.out.println("Percentage of females in class is:" + percentageOfFemale);
		
	
	
	
	
	
	
	
	}
}
