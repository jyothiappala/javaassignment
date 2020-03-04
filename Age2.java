import java.time.LocalDate;
import java.util.*;
import java.time.Period;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Age2
{
	public static void main(String ar[]) throws ParseException
	{
		HashMap<String,String> map=new HashMap<String,String>();
		Scanner s=new Scanner(System.in);
		SimpleDateFormat f=new SimpleDateFormate("yyyy-mm-dd");
		int n=IntegerParseInt(s.nextInt());
		for(i=0;i<n;i++)
		{
			String k[]=s.nextLine();
			String v[]=s.nextLine();
			Date d=f.parse(v);
			map.put(k,d);
		}
		LocalDate date1= LocalDate.now();
		LocalDate date2=LocalDate.of(d);
		Period p=new Period.between(date2,date1);
		ArrayList<String> list=new ArrayList<String>();
		if(p > 17)
		{
			list.add(map.getKey());
		}
		System.out.println(list);
	}
}