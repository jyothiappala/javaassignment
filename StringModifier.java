import java.util.Scanner;
class StringModifier
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter String:");
		StringBuffer str=new StringBuffer();
		str.append(s.nextLine());
		System.out.println("enter character:");
		char c=s.next().charAt(0);
		System.out.println("enter position:");
		int p=s.nextInt();
		insertCharacter(str,c,p);
	}
	static void insertCharacter(StringBuffer str,char c,int p)
	{
		str.insert(p,c);
		System.out.println(str);	
	}
}