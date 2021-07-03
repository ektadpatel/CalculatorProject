package com.miit;

public class Calculator extends Functions {

	public static void main(String[] args) {
		quit();

	}

	public static void quit() {

		System.out.println("Enter the Operator:");

		char op = sc.next().charAt(0);

		switch (op) {

		case '+':

			add(num1, num2);
			break;

		case '-':
			sub(num1, num2);
			break;

		case '*':
			multi(num1, num2);
			break;

		case '/':
			div(num1, num2);
			break;

		case '%':
			mod(num1, num2);
			break;

		case 'e':
			exit();

		}
		quit();

	}
}
