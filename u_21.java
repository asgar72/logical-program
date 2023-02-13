package LogicalPrograms;

import java.util.Scanner;
//WAP to print the all prime number between two numbers 
public class u_21 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter lower limit : ");
	int l1 = sc.nextInt();
	System.out.print("Enter upper limit : ");
	int l2 = sc.nextInt();
	
	boolean prime=true;
	for(int i=l1;i<=l2;i++)
	{
		if(i==1 || i==2)
		{
			continue;
		} 
		int j=2;
		while (j<i)
		{
			if(i%j==0)
			{
				prime =false;
				break;
			}
			j++;
		}
		if(prime==true)
		{
			System.out.println(i);
		}
		prime=true;
	}
}
}
