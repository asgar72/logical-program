package LogicalPrograms;
//17. WAP to check for palindrome number.
public class q_17 {
		public static void main(String[] args) {
			int num=121;
			int temp=num;
			int rev=0,rem;
			while (temp != 0) {
				rem = temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if (num==rev) 
			{
				System.out.println(num+" is Palindrome number.");
			} 
			else 
			{
				System.out.println(num+" is Not palindrome number.");
			}
		}
}
