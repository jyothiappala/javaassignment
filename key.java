import java.util.Scanner;
class key
{
	public static void main(String ar[])
	{
		int i,c=0,sum=0,j;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter number: ");
			a[i]=s.nextInt();
			System.out.println(a[i]);	
		}
		System.out.println("enter key: ");
		int k=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(k==a[i]){
			System.out.println("found at "+i);
			c=1;
			break;}
		}
		if(c==0)
		System.out.println("Not Found");
	}
}