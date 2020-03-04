import java.util.Scanner;
class tiles
{
	public static void main(String ar[])
	{
		double c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter Width :");
		double w=s.nextInt();
		System.out.println("enter height :");
		double h=s.nextInt();
		double sq2=8*8;
		double sq1=w*h;
		double T=sq1/sq2;
		if(T%10 !=0)
		{
			while( T%10 !=0)
			{
				T=T-0.5;
				c=c+0.5;
			}
			System.out.println(T+" "+c);
		}
		else
		{
			System.out.println(T+" "+c);
		}
	}
}