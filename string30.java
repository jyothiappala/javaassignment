import java.util.*;
class string30
{
	public static void main(String ar[])
	{
		int i=0,j=0,c=0;
		char f;
		String str1="hii";
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(i = 0; i < str.length(); i++){
		if(str.charAt(i) == ' '){
            		break;
            	}
		c++;	}
		for(i=0;i<c;i++)
		{
			for(j=i;j<str.length();j=j+c+1)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}