import java.util.*;
class teacher
{
	public static void main(String args[])
	{
		int i,n;
		double sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N value:");
		n=s.nextInt();
		int a[]=new int[100];
		for(i=0;i<n;i++)
		{
			for(i=0;i<n;i++)
			{
				System.out.println("enter number");
				a[i]=s.nextInt();
				if(a[i]%2!=0 && a[i]>0)
				{
					sum=sum+1;
				}
				else if(a[i]%2==0 && a[i]>0)
				{
					sum=sum-0.5;
				}
				else
				{
					sum=sum-1;
				}
			}
			System.out.println(sum);
		}
	}
}