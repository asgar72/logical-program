package Logics;
//WAP to print 1 to 500 Armstrong Numbers...
public class Arms_500 {
	public static void main(String[] args) {
		{
			int i=1,rem,total, num;
			System.out.println("Armstrong numbers between 1 to 500 are");
			while (i < 500) {
				num = i;
				total = 0;
				while (num > 0) {
					rem = num % 10;
					//total = total+(rem*rem*rem);
					total += Math.pow(rem, 3);
					num = num/10;
				}
				if (total==i)
					System.out.println(i);
					i++;
			}
		}
	}
}
