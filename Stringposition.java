import java.util.Scanner;
class StringModifier
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter String:");
		String s=s.nextLine();
		System.out.println("enter character:");
		char c=s.next().CharAt(0);
		System.out.println("enter position:");
		int p=s.nextInt();
	}
	static void insertCharacter(String str,char c,int p)
	{
		str.insert(c,p);
		System.out.println(str);	
	}
}