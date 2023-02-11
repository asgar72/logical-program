package LogicalPrograms;

//2. WAP to find the largest of two and three numbers
public class b_2 {
	public static void main(String[] args) {
		int a = 30, b = 95, c = 70;
		if (a > b && a > c) {
			System.out.println("a is largest.");
		}
		if (b > a && b > c) {
			System.out.println("b is largest.");
		} else {
			System.out.println("c is largest.");
		}
	}
}
