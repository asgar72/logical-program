package Logics;

import java.util.Scanner;
//WAP to add two numbers.
public class Add {
	public static void main(String[] args) {
		txt();
	}

	public static void txt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("Enter a Second value");
		int b = sc.nextInt();
		System.err.println("sum is :" +(a+b));

	}
}