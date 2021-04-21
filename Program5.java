/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Programming Assignment 5
*
* Suppose you are to design a program that prompts the user to enter a String and displays the number of vowels,
* consonants, and spaces. Assume letters A, E, I, O, U (or a, e, i, o, u) as the vowels.
********************************************/

import java.util.*;
public class Program5 {

	public static void main(String[] args) {
	
		// Declare
		Scanner input = new Scanner(System.in);
		int vowel = 0; 	
		int consonant = 0;
		int space = 0;

		// Input
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		// For loop and if statements
		for (int i = 0; i < s.length(); i++) {
			// Check whether the character is a space
			char ch = s.charAt(i);
			if (ch == ' ') {
				space++;
			}
			// Check whether the character is a vowel or consonant
			if (Character.isLetter(s.charAt(i))) {
				if (Character.toUpperCase(s.charAt(i)) == 'A' || Character.toUpperCase(s.charAt(i)) == 'E' || 
					Character.toUpperCase(s.charAt(i)) == 'I' || Character.toUpperCase(s.charAt(i)) == 'O' ||  
					Character.toUpperCase(s.charAt(i)) == 'U') {
					vowel++;
				}
				else
					consonant++;
			}
		}

		// Output
		System.out.println("\"The number of vowels is " + vowel + "\"");
		System.out.println("\"The number of consonants is " + consonant + "\"");
		System.out.println("\"The number of spaces is " + space + "\"");
	}
}
