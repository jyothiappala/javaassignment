import java.util.Scanner;
class  reversenumber
{
	public static void main(String ar[])
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}