import java.util.*;
class fib
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of months");
		int n=s.nextInt();
		int a=0,b=1,temp,c=1;
		if(n==1)
			System.out.println(a);
		if(n==2)
			System.out.println(a+b);
		else
		{
			System.out.println(a);
			System.out.println(b);
			while(c<(n-1))
			{
				temp=a+b;
				System.out.println(temp);
				a=b;
				b=temp;
				c++;
			}
		}
	}
}