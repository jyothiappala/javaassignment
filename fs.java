import java.util.Scanner;
class fs
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Three numbers:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		System.out.println("first largest number is: ");
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1);
				System.out.println("second largest number is: ");
				if(n2>n3)
					System.out.println(n2);
				else
					System.out.println(n3);
			}
			else
			{
				System.out.println(n3);
				System.out.println("second largest number is: ");
				if(n2>n1)
					System.out.println(n2);
				else
					System.out.println(n1);
			}
		}
		else if(n2>n3)
			{
				if(n2>n1){
				System.out.println(n2);
				System.out.println("second largest number is: ");
				if(n1>n3)
					System.out.println(n1);
				else
					System.out.println(n3);}
				else
				{
				System.out.println(n3);
				System.out.println("second largest number is: ");
				if(n1>n3)
					System.out.println(n1);
				else
					System.out.println(n3);
				}
			}
		else{
			System.out.println(n3);
			System.out.println("second largest number is: ");
			if(n1>n2)
					System.out.println(n1);
				else
					System.out.println(n2);
		}
		}
}