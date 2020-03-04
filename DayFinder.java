import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DayFinder
{
	public static void main(String[] args) throws ParseException 
	{
		String str1[]= new String[]{"2020-02-04","2020-02-03","2019-11-06"};
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=f1.parse(str1[0]);
		SimpleDateFormat sf1=new SimpleDateFormat("EEEE");
		String str2=sf1.format(d1);
		System.out.println(str2);
		
		
		SimpleDateFormat f2=new SimpleDateFormat("yyyy-MM-dd");
		Date d2=f2.parse(str1[1]);
		String str3=sf1.format(d2);
		System.out.println(str3);
		
		
		SimpleDateFormat f3=new SimpleDateFormat("yyyy-MM-dd");
		Date d3=f3.parse(str1[2]);
		String str4=sf1.format(d3);
		System.out.println(str4);
		
	}
}
