package LogicalPrograms;
//16. WAP to print Fibonacci series using recursion.
public class p_16 {
			static int a=0,b=1,c;
			public static void main(String[] args) {
				System.out.print(a+" "+b);
				p_16 ob = new p_16();
				ob.Fib(10);
			}
			
			void Fib(int i)
			{
				if(i>=1)
				{
					c=a+b;
					System.out.print(" "+c);
					a=b;
					b=c;
					Fib(i-1);
				}
			}
}
