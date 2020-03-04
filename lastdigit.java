import java.util.Scanner;
class lastdigit
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number: ")
		int n=s.nextInt();
		int n1=n%10;
		switch(n1)
		{
			case 0:
				System.out.println("zero");
				break;
			
			case 1:
				System.out.println("One");
				break;
				
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
		}
	}
}