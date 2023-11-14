package com.jbd;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count or the number : ");
		number = input.nextInt();
		input.close();
		fibonacci(number);
	}

	public static int fibonacci(int number) {

		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		}
		int a = 0, b = 1, c = a + b, d = 0;

		for (int i = 2; i < number; i++) {

			d = c + b;
			a = b;
			b = c;
			c = d;
		}
		return c;
	}
}
