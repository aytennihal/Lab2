package lab_2;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Write a program with a loop that lets the user enter a series of integer
		 * numbers. After all the numbers have been entered, the program should display
		 * the largest and smallest numbers entered.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int fn = sc.nextInt();
		
		int largest = 0, smallest = 0;
		
		while(true) {		
			System.out.println("Do you want to enter another number: 0-NO 1-YES");
			int loop = sc.nextInt();
			
			if (loop == 0) {
				break;
			} else if(loop == 1) {
				
			} else {
				System.out.println("Invalid");
				break;
			}
			
			System.out.println("Enter your number: ");
				int sn = sc.nextInt();
			
			if (fn > sn) {
				largest = fn;
				smallest = sn;
			} else if(sn > fn) {
				largest = sn;
				smallest = fn;
			} else if(fn == sn) {
				largest = smallest = fn = sn;
			}
			
			
		}
		
		System.out.println("Largest = " + largest);
		System.out.println("Smallest = " + smallest);
		
		
		
		
		
	}
}
