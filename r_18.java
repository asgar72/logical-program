package LogicalPrograms;

import java.util.Scanner;

//18. WAP to check for palindrome String.
public class r_18 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string :");
		String s1 = sc.next();
		String rev= "";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev =rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("Palindrome sting");
		} else {
				System.out.println("Not palindrome string");
		}
	}
}
