package com.miit;

import java.util.Scanner;

public class Functions {
	static double num1, num2;
	static Scanner sc = new Scanner(System.in);

	public static double add(double num1, double num2) {

		System.out.println("Enter the number 1:");
		num1 = sc.nextDouble();

		System.out.println("Enter the number 2:");
		num2 = sc.nextDouble();

		double ans = num1 + num2;
		System.out.println(ans);
		return ans;

	}

	public static double sub(double num1, double num2) {
		System.out.println("Enter the number 1:");
		num1 = sc.nextDouble();

		System.out.println("Enter the number 2:");
		num2 = sc.nextDouble();

		double ans = num1 - num2;
		System.out.println(ans);
		return ans;
	}

	public static double multi(double num1, double num2) {
		System.out.println("Enter the number 1:");
		num1 = sc.nextDouble();

		System.out.println("Enter the number 2:");
		num2 = sc.nextDouble();

		double ans = num1 * num2;
		System.out.println(ans);
		return ans;
	}

	public static double div(double num1, double num2) {
		System.out.println("Enter the number 1:");
		num1 = sc.nextDouble();

		System.out.println("Enter the number 2:");
		num2 = sc.nextDouble();

		double ans = num1 / num2;
		System.out.println(ans);
		return ans;

	}

	public static double mod(double num1, double num2) {
		System.out.println("Enter the number 1:");
		num1 = sc.nextDouble();

		System.out.println("Enter the number 2:");
		num2 = sc.nextDouble();

		double ans = num1 % num2;
		System.out.println(ans);
		return ans;
	}

	public static void exit() {
		System.exit(0);
	}
}
