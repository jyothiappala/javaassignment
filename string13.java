import java.lang.*;
import java.util.*;
class string13
{
	public static void main(String ar[])
	{
		int i,j=0,c=0;
		String Builder="C:/IBM/DB2/PROGRAM/DB2COPY1.EXE";
		String Builder []b=new String Builder[100];
		for(i=0;i<s.length();i++)
		{
			if(s.equals("/"))
			{
				c++;
				b.insert(b.charAt(i),s.charAt());
				if(c==1)
					System.out.println("Drive: "+b+"/");
					j=0;
				if(c==4)
					System.out.println("Folders:"+b.replaceAll('/','|'));
					j=0;
				if(c>4)
					System.out.println("File"+b);
					j=0;
				j++;
			}
		}
	}
}