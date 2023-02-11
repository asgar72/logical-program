package LogicalPrograms;
//12. WAP to reverse a String.
public class l_12 {
		public static void main(String[] args) {
			String s1 = "java";
			String rev =" ";
			
			for(int i=s1.length()-1;i>=0;i--)
			{
				rev = rev + s1.charAt(i);
			}
			System.out.println(rev);
		}
}
