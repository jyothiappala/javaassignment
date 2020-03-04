import java.util.*;
class loop
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		System.out.println("enter b value");
		int b=s.nextInt();
		if(a>b)
			System.out.println("a cannot be more than b");
		if(a<=b)
		while(a<=b)
		{
			System.out.println(a);
			a++;
		}
	}
}