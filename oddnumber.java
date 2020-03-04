import java.util.Scanner;
class oddnumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		
		}
	}
}