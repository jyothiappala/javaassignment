import java.util.Scanner;
class CharacterCounter
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter String: ");
		String str=s.nextLine();
		countCharacter(str);
	}
	static void countCharacter(String str)
	{
		int i,j;
		int a[]=new int[26];
		for(i=0;i<26;i++)
		a[i]=0;
		for(i=0;i<str.length();i++)
		{
			j=str.charAt(i)-'a';
			a[j]++;
		}
		for(i=0;i<26;i++)
		{
			if(a[i]>0 )
			System.out.println((char)(i+'a')+"="+a[i]);	
		}

	}
}