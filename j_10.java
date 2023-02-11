package LogicalPrograms;

import java.util.Scanner;

//10. WAP to find the factorial of the number using recursion.
public class j_10 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. for factorial :");
			int num = sc.nextInt();
			int fact;
			j_10 ob = new j_10();
			fact = ob.calFact(num);
			System.out.println("Factorial of "+num+" is "+fact);
		}
		//Recursion
		int calFact(int num)
		{
			if(num>=1)
			{
				return (num*calFact(num-1));
			}
			return 1;
		}
}
