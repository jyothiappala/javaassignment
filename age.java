import java.util.*;
class age1
{
	public method(HashMap map)
	{
		LocalDate birthdate = new LocalDate (1970, 1, 20);     
		LocalDate now = new LocalDate();                       
 		Period period = new Period(birthdate, now, PeriodType.yearMonthDay());
 		period.getYears());
		
	}
}
class age
{
	public static void main(String ar[])
	{
		HashMap<String,String> map=new HashMap<String>();
		Scanner s=new Scanner(System.in);
		int n=Integer ParseInt(s.nextInt());
		for(i=0;i<n;i++)
			map.put(s.nextLine());
		
		age1 obj=new age1();
		obj.method(map);
	}
}