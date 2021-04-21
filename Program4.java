/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Programming Assignment 4
*
* Suppose you are to design a payroll program where the user inputs the employee’s name, number of hours worked,
* hourly pay rate, federal tax rate, and state tax rate and prints a summary of the employee’s paycheck.
********************************************/

import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
				
		// Input
		System.out.print("Enter employee's name: ");
		String employee = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		// Calculate
		double grossPay = hours * payRate;
		double federalWithholding = grossPay * federalTax;
		double stateWithholding = grossPay * stateTax;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
		
		// Output
		System.out.printf("\nEmployee Name: " + employee);
		System.out.printf("\n%-1s%-1.2f", "Hours Worked: ", hours);
		System.out.printf("\n%-1s%-1s%-1.2f", "Pay Rate: ", "$", payRate);
		System.out.printf("\n%-1s%-1s%-1.2f", "Gross Pay: ", "$", grossPay);
		System.out.printf("\n%-1s\n", "Deductions:");
		System.out.printf("\t%-1s", "Federal Withholding");
		System.out.printf(" (%.2f%%)%-1s$%-5.2f\n", federalTax*100, ": ", federalWithholding);
		System.out.printf("\tState Withholding (%.2f%%)%-1s$%-5.2f\n", stateTax*100, ": ", stateWithholding);
		System.out.printf("\tTotal Deduction%-1s$%-5.2f\n", ": ", totalDeduction);
		System.out.printf("Net Pay: $%-5.2f", netPay);
	}
}
