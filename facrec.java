import java.util.Scanner;
class facrec
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=fact(n);
		System.out.println(t);
	}
	static int fact(int a)
	{
		if(a>=1)
		return a*fact(a-1);
		else 		
			return 1;
	}
}
