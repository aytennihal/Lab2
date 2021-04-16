package lab_2;

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int value =sc.nextInt();
		
        int sum = 0;

        for (int i= 1; i<=value; i++ ) {
	         sum+= i; 
	         
	          }
        
        System.out.println("The sum of number is:" + sum);

	}
	}
