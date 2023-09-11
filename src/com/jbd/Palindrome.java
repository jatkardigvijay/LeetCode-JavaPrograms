package com.jbd;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = input.nextInt();
		input.close();
		isPalindrome(number);
	}

	public static boolean isPalindrome(int number) {

		int reverse = 0, temp, remainder;
		temp = number;
		while (number > 0) {
			
			remainder = number % 10;
			reverse = (reverse*10) + remainder ;
			number = number /10;
		}
		number = temp;
		if (reverse == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		return true;

	}
}
