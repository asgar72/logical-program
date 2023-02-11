package LogicalPrograms;

//19. WAP to check for Armstrong number.
public class s_19 {
	public static void main(String[] args) {
			int n=153,rem,arm=0;
			int ori=n;
			while (n>0) {
				rem = n % 10;
				arm =(rem*rem*rem)+arm;
				n = n/10;
			}
			if (arm == ori) {
				System.out.println("Armstronge Number");
			} else {
				System.out.println("Not Armstronge Number");
			}
	}
}
