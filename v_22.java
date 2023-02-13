package LogicalPrograms;

import java.util.Scanner;
//WAP to check give number is special or not ??
public class v_22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number :");
	int num = sc.nextInt();
	int fact = 1, sum = 0;
	while (num !=0) 
	{
		sum =sum+num % 10;
		fact=fact*num%10;
		num=num/10;
	}
		if (fact == sum) 
		{
			System.out.println("This is special number"+num);
		} 
		else 
		{
			System.out.println("This is not special number "+num);
		}

}
}
