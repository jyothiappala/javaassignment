import java.util.Scanner;
class  factorial
{
	public static void main(String ar[])
	{
		int sum=1,c=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(c<=n)
		{
			sum=sum*c;
			c++;
		}
		System.out.println(sum);
	}
}