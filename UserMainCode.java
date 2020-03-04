package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList <Integer> list1=new ArrayList(5);
		ArrayList <Integer> list2=new ArrayList(5);
		UserMainCode u=new UserMainCode();
		System.out.println("enter list1");
		for(int i=0;i<5;i++)
		{
			System.out.println("enter elements "+i);
			list1.add(s.nextInt());
		}
		System.out.println("enter list2");
		for(int i=0;i<5;i++)
		{
			System.out.println("enter elements "+i);
			list2.add(s.nextInt());
		}
		
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list1.add(1);
		list1.add(60);
		list1.add(30);
		list1.add(40);
		list1.add(3);
		list2.add(7);
		list2.add(6);
		list2.add(2);
		list2.add(4);
		list2.add(80);
		list1.addAll(list2);
		u.sortMergedArrayList(list1);
	}
	static void sortMergedArrayList(ArrayList a)
	{
		Collections.sort(a);
		//System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.get(6));
		System.out.println(a.get(8));
	}
}
