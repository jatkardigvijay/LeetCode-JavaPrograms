package com.jbd;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {

		int i1, i2, sum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		i1 = input.nextInt();
		System.out.print("Enter number 2 : ");
		i2 = input.nextInt();
		input.close();
		sum = i1 + i2;
		System.out.println("Sum of " + i1 + " and " + i2 + " is : " + sum);
	}
}
