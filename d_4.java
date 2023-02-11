package LogicalPrograms;

//4. WAP to check for leap year.
public class d_4 {
		public static void main(String[] args) {
			int year =2017;
			if ((year % 400==0)||(year %4==0 && year %100!=0)) {
				System.out.println("Leap year");
				
			} else {
					System.out.println("Not lear year");
			}
		}
}
