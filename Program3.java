/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Programming Assignment 3
*
* Suppose you are a computer salesman, and your income depends on the total sales and commissions earned for
* the computers that you sell. Commission rates vary depending on how many units you sold (see chart below). Your
* income equals to the total sales plus the commission where the commission equals to total sales times the
* commission rate. That is, commission = total sales * commission rate and income = total sales + commission. 
********************************************/
import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		
		// Displays the commission rate list
		System.out.println("Total Sales					Commission rate %");
		System.out.println("Less than 200 sold				8%");
		System.out.println("Greater or equal to 200 sold			10%");
		System.out.println("Greater or equal to 400 sold			12%");
		
		// Declare
		Scanner input = new Scanner(System.in);
		double commissionRate1 = 0.08;
		double commissionRate2 = 0.10;
		double commissionRate3 = 0.12;
		double commission;
		double income;
		
		
		// Input
		System.out.print("Enter total sales: ");
		int totalSales = input.nextInt();
		
		// Conditional statements and calculates commission and income
		if (totalSales < 200) {
			commission = totalSales * commissionRate1;
			income = totalSales + commission;
			System.out.println("Saleman's total sales is " + (double)totalSales + " and commision is " + commission);
			System.out.println("Saleman's income is " + income);
		}
		else if (totalSales >= 200 && totalSales < 400) {
			commission = totalSales * commissionRate2;
			income = totalSales + commission;
			System.out.println("Saleman's total sales is " + (double)totalSales + " and commision is " + commission);
			System.out.println("Saleman's income is " + income);
		}
		else if (totalSales > 400) {
			commission = totalSales * commissionRate3;
			income = totalSales + commission;
			System.out.println("Saleman's total sales is " + (double)totalSales + " and commision is " + commission);
			System.out.println("Saleman's income is " + income);
		}
	}
}
