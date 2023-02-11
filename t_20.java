package LogicalPrograms;

//20. WAP to check for Armstrong 1 to 500.
public class t_20 {
	public static void main(String[] args) {
		for (int i=1; i<=500; i++) {
            int sum =0;
            int num =i;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit* digit * digit;
                num = num / 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
	}
}
