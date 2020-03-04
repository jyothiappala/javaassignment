import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate; 
import java.time.Period;
import java.util.Scanner;
import java.util.Calendar;
class DayF
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());	
		//String str1[]= new String[n];
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<n;i++)
		{
			LocalDate date=LocalDate.now();
			System.out.println("enter date: ");
			Date d1=f1.parse(s.nextLine());
			Calendar c = Calendar.getInstance();
			c.setTime(d1);
			int year = c.get(Calendar.YEAR);
  			int month = c.get(Calendar.MONTH) + 1;
  			int dat = c.get(Calendar.DATE);
			LocalDate date2= LocalDate.of(year,month,dat);
			Period p=Period.between(date2,date);
			System.out.println(p.getYears());
			if(p.getYears() > 18)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
