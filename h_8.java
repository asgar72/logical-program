package LogicalPrograms;

import java.util.Scanner;

//8. WAP to print the table of any number.
public class h_8 {
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter number for table :");
			int num = sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"x"+i+"="+num*i);
			}
	}
}
