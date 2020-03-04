import java.util.Scanner;
class sita
{
	public static void main(String ar[])
	{
		int i,sum=0,n1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter Number of sticks :");
		int n=s.nextInt();
		n1=n*2;
		while(true)
		{
			if(n%4==0)
			{
				System.out.println(n);
				break;
			}
			n=n-1;
		}
	}
}
