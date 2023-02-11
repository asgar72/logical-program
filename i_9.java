package LogicalPrograms;

import java.util.Scanner;

//9. WAP to find the factorial of the number.
public class i_9 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number fro factorial :");
			int num = sc.nextInt();
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact =fact*i;
			}
			System.out.println(fact);
		}
}
