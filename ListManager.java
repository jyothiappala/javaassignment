import java.util.*;
class ListManager
{
	public static void main(String ar[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		list1.add("jyothi");
		list1.add("priya");
		list1.add("akhi");
		list1.add("ash");
		list2.add("hiii");
		list2.add("ash1");
		list2.add("jyothi");
		list2.add("welcome");
		for(String i : list1)
		System.out.println(i);
		list1.retainAll( list2 );
        	System.out.println( list1 );
	}
}