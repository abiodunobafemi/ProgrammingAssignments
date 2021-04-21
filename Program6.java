/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Programming Assignment 6
*
* Assume you are working for a company and given the task to build an Email Registration Program
********************************************/

import java.util.*;
public class Program6 {

	public static void main(String args[]) {
		
		// Declare
        String firstname, lastname, birthyear, securityquestion;
        String email, password;
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first name: ");   
        firstname = input.nextLine();
        System.out.print("Enter last name: ");
        lastname = input.nextLine();
        System.out.print("(Security Question) Favorite car maker: ");
        securityquestion = input.nextLine();
        System.out.print("Enter birth year: ");
        int year = input.nextInt();
        
        // Calls email registration method
        email = defaultInfo(firstname, lastname);  
        
        // Calls password method
        password = defaultInfo(firstname, securityquestion, year);
        
        // Calls result screen method
        resultScreen(firstname, lastname, email, password);
    }
    
	// email registration method (Overloading methods)
    public static String defaultInfo(String first, String last) {
        String email;
        email = first.charAt(0) + "." + last + "@kean.edu";
        
        // Returns lowercase
        return email.toLowerCase();
    }
    
    // Create password method
    public static String defaultInfo(String last, String question, int year) {
        String pass;
        pass = last.substring(0, 3) + year + question.substring(0, 3);
        
        // Capitalizes pass
        pass = pass.toUpperCase();
        
        // Returns password
        return pass;
        
    }
    
    // result screen method
    public static void resultScreen(String first, String last, String email, String pw) {
        System.out.println("====================================");
        System.out.println(first + " " + last);
        System.out.println("Kean email: " + email);
        System.out.println("Kean password: " + pw);
        System.out.println("====================================");
    }

}
