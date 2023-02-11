package LogicalPrograms;

import java.util.Scanner;

//5. WAP to create calculator using switch statement
public class e_5 {
		public static void main(String[] args) {
			String yn;
			do {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter first Number :");
				int n1 = sc.nextInt();
				System.out.print("Enter second Number :");
				int n2 =sc.nextInt();
				System.out.print("Select Symbol (+,-,*,/)  ");
				String sym = sc.next();
				int res;
				switch (sym) {
				case "+":res=n1+n2;
						System.out.println("Addition is :"+res);
						break;
				case "-":res=n1-n2;
						System.out.println("Substraction is :"+res);
						break;
				case "*":res=n1*n2;
						System.out.println("Multiplication is :"+res);
						break;
				case "/":res=n1/n2;
						System.out.println("Division is :"+res);
						break;
				default:System.out.println("Invalid Symbol");
						break;
				}
				System.out.println("Do you want to continue (Press y for Yes and n for No)");
				yn=sc.next();
			} while (yn.equals("y")||yn.equals("Y"));
		}
}
