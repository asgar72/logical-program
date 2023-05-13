package Logics;

import java.util.Scanner;
//WAP to find only odd numbers.
public class EvenArr {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the elements");
			for(int i=0;i<size;i++)//Store in array
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Odd elements from array");
			for(int i=0;i<size;i++)//check even or odd 
			{
				if (arr[i]%2!=0) 
					System.out.println(arr[i]);
			}
		}
}
