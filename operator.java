package Logics;

public class operator {
	public static void main(String[] args) {
		// Arithmetic
		System.out.println("\nThis is arthmetic operator");
		System.out.println(10 + 20);
		System.out.println(23 - 52);
		System.out.println(41 * 7);
		System.out.println(25 / 5);
		System.out.println(50 % 10);

		// Relational
		System.out.println("\nThis is relatinal operator");
		System.out.println(10 > 50);
		System.out.println(20 < 51);
		System.out.println(56 <= 45);
		System.out.println(89 >= 89);
		System.out.println(90 == 99);
		System.out.println(10 != 10);

		// logical
		System.out.println("\nThis is logical operator");
		System.out.println(100 < 50 && 45 > 30);
		System.out.println(12 == 12 || 45 > 50);

		// Increment and Decrement
		System.out.println("\nThis is increment and decrement");
		int a = 10;
		// int b=a++;
		// int b=a++ + a++;
		int b = a--;
		System.out.println(a + "," + b);
		System.out.println("\n");

		// pre increment
		int x = 10;
		int y = ++x;
		System.out.println(x + "," + y);

		// post inc/dec ==> 1.assignment 2.inc/dec
		// pre inc/dec ==> 1.inc/dec 2.assignment
		System.out.println("\nThis is increment and decrement");
		int m = 7;
		int n = 10;
		int o = m++ + n++ + --m + m-- + n-- + --n + m++;
		System.out.println(m + "," + n + "," + o);

		System.out.println("\nThis is assignment operator\n");
		int i = 10;
		int j = 10;
		System.out.println(i == j);

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		// s1=s2;
		// System.out.println(s1==s2);
		System.out.println(s1.equals(s2));// this is works for only string.....

		operator p1 = new operator();
		operator p2 = new operator();
		System.out.println(p1 == p2);
		p1 = p2;
		System.out.println(p1 == p2);

	}
}
