package LogicalPrograms;

//13. WAP to check for prime number.
public class m_13 {
	public static void main(String[] args) {
		int num = 8, temp = 0;
		for (int i=2; i<=num-1; i++) 
		{
			if (num%i==0) {
				temp = temp+1;
			}
		}
		if (temp==0) 
		{
			System.out.println("prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
