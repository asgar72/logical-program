package LogicalPrograms;

import java.util.Scanner;

//11. WAP to reverse a number.
public class k_11 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number :");
			int num = sc.nextInt();
			int rem,rev=0;
			while (num!=0) {
				rem = num % 10;
				rev = rev*10+rem;
				num = num /10;
			}
			System.out.println(rev);
		}
}
