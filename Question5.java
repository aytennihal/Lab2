package lab_2;

import java.util.Scanner;

public class Question5 {
 public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the charge of meal:");
		double chargeOfMeal =sc.nextInt();
		
		double tax = (6.5*chargeOfMeal)/100;
		double tip = (chargeOfMeal*20)/100;
		
		double totalOfMeal;
		totalOfMeal= chargeOfMeal+tip+tax;		
		
		
		System.out.println("Meal Charge:" + chargeOfMeal);
		System.out.println("Tax Amount:" + tax);
		System.out.println("Tip Amount:" + tip);
		System.out.println("Total:" + totalOfMeal);

	
	
	
	
	
	
}
}
