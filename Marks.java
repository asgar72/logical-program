package Logics;

import java.util.Scanner;
//WAP to print subject marks & Grading .
public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Subject Marks");
		int s1 = sc.nextInt();
		System.out.println("Enter the 2nd Subject Marks");
		int s2 = sc.nextInt();
		System.out.println("Enter the 3rd Subject Marks");
		int s3 = sc.nextInt();
		System.out.println("Enter the 4th Subject Marks");
		int s4 = sc.nextInt();
		System.out.println("Enter the 5th Subject Marks");
		int s5 = sc.nextInt();
		int avg = (s1 + s2 + s3 + s4 + s5) / 5;
		System.out.println("Student Average marks : " + avg + "%");
		System.out.println("Grading :");
		if (avg >= 85)
			System.out.println("A");
		else if (avg >= 70 && avg < 85)
			System.out.println("B");
		else if (avg >= 55 && avg < 70)
			System.out.println("C");
		else
			System.out.println("D");
		
		System.out.println("Final Result :");
		if(s1<35 || s2<35 || s3<35 || s4<35 || s5<35 )
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}
}

