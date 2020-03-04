import java.util.Scanner;
class three
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Three numbers:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int c=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println(c);
	}
}