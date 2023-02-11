package LogicalPrograms;

//3. WAP to check for even or odd number
public class c_3 {
	public static void main(String[] args) {
			int a=31;
			if (a%2==0) {
				System.out.println("number is even.");
			} else {
				System.out.println("number is odd.");
			}
			
			System.out.println("\nThis is even");
			for (int i=1;i<=20;i++) {
				if (i%2==0)
				System.out.println(i);
			}
			System.out.println("This is odd");
			for (int i=1;i<=20;i=i+2) {
				System.out.println(i);
			}
		
	}
}
