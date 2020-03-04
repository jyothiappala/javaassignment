package registration;

import java.util.Scanner;

public class testregistration {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter user 1 details");
		String name=s.nextLine();
		String mailid=s.nextLine();
		String mobileno=s.nextLine();
		String totprice=s.nextLine();
		registration r1=new registration(name,mailid,mobileno,totprice);
		System.out.println("enter user 2 details");
		String name1=s.nextLine();
		String mailid1=s.nextLine();
		String mobileno1=s.nextLine();
		String totprice1=s.nextLine();
		registration r2=new registration(name1,mailid1,mobileno1,totprice1);
		if(r1.equals(r2))
		{
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}
