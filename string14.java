import java.util.*;
import java.lang.*;
public class string14
{
	public static void main(String ar[])
	{
		int i,min;
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		if(s1.length() != s2.length())
		{
			if(s1.length()>s2.length())
			{
				min=s1.length()-s2.length();
				for(i=min;i<s1.length();i++)
				{
					System.out.print(s1.charAt(i));
				}
			}
			else
			{
				min=s2.length()-s1.length();
				for(i=min;i<s2.length();i++)
				{
					System.out.print(s2.charAt(i));
				}
			}
			
		}
		
	}
}