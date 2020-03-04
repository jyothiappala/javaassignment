import java.util.Scanner;
class bishop
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Chess size :");
		int n=s.nextInt();
		if(n>=2)
			System.out.println("Bishops :"+" "+(2*(n-1)));
	}
}