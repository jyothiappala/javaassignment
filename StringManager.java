import java.util.Scanner;
class StringManager
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		StringBuffer str1=new StringBuffer();
		System.out.println("enter string1");
		str1.append(s.nextLine());
		StringBuffer str2=new StringBuffer();
		System.out.println("enter string2");
		str2.append(s.nextLine());
		System.out.println("enter character");
		char ch=s.next().charAt(0);	
		insertString(str1,str2,ch);
	}
	static void insertString(StringBuffer str1,StringBuffer str2,char ch)
	{
		int i;
		for(i=0;i<str1.length();i++)
		{
			if(ch==str1.charAt(i))
			{
				str1.insert(i,str2);
				break;
			}
		}
		System.out.println(str1);
	}
}