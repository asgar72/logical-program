package LogicalPrograms;

//7. WAP to swap the two numbers without using the third variable.
public class g_7 {
	public static void main(String[] args) {
			int a=20,b=50;
			System.out.println("Before swap a="+a+" b="+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After swap a="+a+" b="+b);
	}
}
