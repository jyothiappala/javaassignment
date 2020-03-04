import java.util.Scanner;
class positive
{
	public static void main(String ar[])
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter N value :");
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter number");
			a[i]=s.nextInt();
			if(a[i]>0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("SUM ="+"  "+sum);
	}
}