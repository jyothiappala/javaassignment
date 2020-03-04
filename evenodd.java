import java.util.Scanner;
class evenodd
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n1=s.nextInt();
		int c=(n1%2==0)?1:0;
		if(c==1)
		System.out.println("even");
		else
		System.out.println("odd");
	}
}