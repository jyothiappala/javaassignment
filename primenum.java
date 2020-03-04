import java.util.Scanner;
class primenum
{
	public static void main(String ar[])
	{
		int i,c=0,sum=0,j;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(i=n;i<m;i++)
		{
			for(j=i;j>0;j--)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				System.out.println(i);
				sum=sum+i;
			}
			c=0;
		}
		System.out.println("sum: "+sum);
	}
}