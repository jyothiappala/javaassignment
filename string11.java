import java.lang.*;
class string11
{
	public static void main(String []ar)
	{
		String s="Welcome to Java World";
		System.out.println(s.charAt(5));
		System.out.println(s.compareToIgnoreCase("WelcomE"));
		System.out.println(s.concat("  Let us learn"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.replaceAll("a","e"));
		System.out.println(s);
		System.out.println(s.substring(5,10));
		
	}
}