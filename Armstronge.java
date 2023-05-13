package Logics;
//WAP to print 1 to 500 Armstrong Numbers using Recursion...
public class Armstronge {
	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 1 to 500 are :");
		arms(1, 500);
	}

	public static void arms(int a1, int a2) {
		for (int i=1; i<=a2; i++) {
			int j = i;
			int temp = i;
			int sum = 0;
			int rem = 0;
			while (j > 0) {
				rem = j%10;
				sum += rem*rem*rem;
				j = j/10;
			}
			if (temp == sum) {
				System.out.println(temp);
			}
		}
	}
}
