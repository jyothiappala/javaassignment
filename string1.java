import java.util.Scanner;
import java.lang.*;
class string1
{
	public static void main(String ar[])
	{
		String s1="s1";
		String s6="javatech";
		//System.out.print(s6.trim());
		//System.out.print(s6);
		System.out.println(s6.charAt(4));
		String s7=s1.intern();
		System.out.println(s7);
		String s=String.valueOf(20.10);
		System.out.println(s);
		String s2=s6.replace("a","c");
		System.out.println(s2);
	}
}