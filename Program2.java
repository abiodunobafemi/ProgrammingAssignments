// Abiodun Obafemi

import java.util.*;
public class Prog2_2_Obafemi {

	public static void main(String[] args) {
				
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter the initial value of investment: ");
		int initialValue = input.nextInt();
		System.out.print("Enter the final value of investment: ");
		int finalValue = input.nextInt();
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		//  Calculate
		double rateOfReturn =  (Math.pow(((double)finalValue / (double)initialValue), (1 / (double)years))- 1) * 100;
		
		// Output
		System.out.println("Your initial value is " + (double)initialValue + " and the final value is " + (double)finalValue);
		System.out.print("Your annualized rate of return is " + (double)rateOfReturn + "%");
	}

}
