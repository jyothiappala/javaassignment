import java.util.Scanner;
class primeseries
{
	public static void main(String ar[])
	{
		int i,c=0,sum=0,j;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=2;i<n;i++)
		{
			for(j=i;j>0;j--)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
			c=0;
		}
	}
}