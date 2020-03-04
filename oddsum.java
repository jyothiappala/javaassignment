import java.util.Scanner;
class oddsum
{
	public static void main(String ar[])
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}