import java.util.*;
import java.time.*;
import java.text.*;
/*class age
{
	public void method(String map)
	{
		HashMap m=new HashMap(map);
		LocalDate date=LocalDate.now();
		LocalDate birth=LocalDate.of(map);
		Period p=new Period.between(birth,date);
		for(String i:map)
		{
			if(p>=18)
			System.out.println(p.getYears());
		}
	}
}*/
class age1
{
	public static void main(String ar[])throws exception
	{
		int i;
		HashMap<String ,String> map=new HashMap<String,String>();
		Scanner s=new Scanner(System.in);
		int n=Integer.parse(s.nextInt());
		for(i=0;i<n;i++)
		{
			System.out.println("enter name:");
			String name= s.nextLine();
			System.out.println("enter date:");
			String date= s.nextLine();
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
			map.put(name,date1);
			System.out.println(map);
		}
		//age a=new age();
		//a.method(map);
	}
}