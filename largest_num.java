package Logics;

import java.util.Scanner;
//WAP to find the largest of two and three numbers
public class largest_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int x = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int y = sc.nextInt();
		System.out.println("Enter 3rd Number");
		int z = sc.nextInt();
		
		if(x>y&&x>z) {
			System.out.println(x+" is largest");
		}
		else if (y>x&&y>z) {
			System.out.println(y+" is largest");
		}
		else {
			System.out.println(z+" is largest");
		}
		
		/*
		if (x > y)
			System.out.println(x + " is greater");
		else if (y > z)
			System.out.println(y + " is greater");
		else
			System.out.println(z + " is greater");*/
	}
}
