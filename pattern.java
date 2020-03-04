import java.util.Scanner;
class pattern
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=1,i,j;
		while(c<=n)
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println("");
				c++;	
			}
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");	
			c++;
		}
	}
}