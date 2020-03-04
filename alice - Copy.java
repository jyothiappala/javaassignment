import java.util.Scanner;
class alice
{
	public static void main(String ar[])
	{
		int i,sum=0,n1;
		Scanner s=new Scanner(System.in);
		System.out.println("What Bird Said ? :");
		int n=s.nextInt();
		while(n!=0)
		{
			n1=n%10;
			sum=sum+n1;
			n=n/10;
		}
		System.out.println("Then The Correct Path is :"+"  "+sum);
	}
}