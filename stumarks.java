import java.util.*;
class stumarks
{
	public static void main(String ar[])
	{
		int i;
		Scanner s=new Scanner(System.in);
			System.out.println("Enter Name: ");
			String str=s.nextLine();
			System.out.println("Enter 3 marks: ");
			int m1=s.nextInt();
			int m2=s.nextInt();
			int m3=s.nextInt();
			int total=m1+m2+m3;
				System.out.println("Total marks of "+str+" is " +total);
			int avg=total/3;
				System.out.println("Average marks of "+str+" is " +avg);
			if(total>=70)
				System.out.println("first class");
			else if(total>=60)
				System.out.println("second class");
			else if(total>=40)
				System.out.println("pass class");
			else
				System.out.println("fail");
		
	}
}