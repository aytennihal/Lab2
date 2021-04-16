package lab_2;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter amount of purchase:");
	int purchase =sc.nextInt();
	
	double stateTax = (4*purchase)/100;
	double countyTax = (2*purchase)/100;
	

	double totalOfTheSale=purchase + stateTax + countyTax;
 
	System.out.println("Amount of the purchase:" + purchase);
	System.out.println("State sale tax:" + stateTax);
	System.out.println("County sale tax:" + countyTax);
	System.out.println("Total of the sale:" +totalOfTheSale);
	
	
	
}
}