package LogicalPrograms;
//15. WAP to print Fibonacci series. 
public class o_15 {
		public static void main(String[] args) {
			int a=0,b=1;
			System.out.print(a+" "+b);
			int c;
			int num =10;
			for(int i=1;i<=num;i++)
			{
				c = a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
}
