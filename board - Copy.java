import java.util.Scanner;
class board
{
	public static void main(String ar[])
	{
		int c=0,j=0,i;
		int v,f=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter total value:");
		double n=s.nextInt();
		int a[]=new int[100];
		aa : for(i=0;;i++)
		{
			System.out.println("enter 1 to give value or 0 to exit:");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("enter value :");
					a[j]=s.nextInt();
					j++;
					break;
				default:
					System.out.println("exit");
					break aa;
			}
		}
		for(i=0;i<j;i++)
		{
			if(sum<n)
			{
				sum=sum+a[i];
				++f;
			}
		}
		System.out.println(f);
	}
}