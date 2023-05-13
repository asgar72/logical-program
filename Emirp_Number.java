package Logics;

import java.util.Scanner;

// A number is said to be Twisted Prime if it is a prime number and reverse of the number is also prime number..
// Twisted prime number is also called Emrip Number ..
public class Emirp_Number {
			public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter Number :");
				int num=sc.nextInt();
				boolean flag=true;
				int emp = 0;
				for(int i=2;i<num;i++)
				{
					if(num % i == 0)
				    {
						flag=false;
				        break;
				    }
				}
				if(flag){
					System.out.println( num + " is a Prime Number");
				}
				else{
				   System.out.println(num + " is Not Number");
				}
				
				int sum=0;
				while (num!=0) {
					int rev=0;
					rev = rev*10+num%10;
					num =num/10;
					emp =rev;
					System.out.print(emp);
					
				}
			}
}
