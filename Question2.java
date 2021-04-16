package lab_2;

import  java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter count of cookies you ate:");
	int cookieCount =sc.nextInt();
	
	double calorieOfCookie =cookieCount*75;
	
	System.out.println("The total calorie of cookies you ate is " + calorieOfCookie);
	
	
	
}
}