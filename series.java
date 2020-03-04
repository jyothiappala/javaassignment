import java.util.Scanner;
class  series
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i*-1+" ");
			else
				System.out.print(i+" ");
		}
	}
}