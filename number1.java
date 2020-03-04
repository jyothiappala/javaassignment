import java.util.*;
class number1
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		long n=s.nextLong();
		int i,c=0;
		long n2,sum=0,t=0,n1;
		n2=n;
		while(n2!=0)
		{
			n2=n2/10;
			c++;
		}
		long a[]=new long[c];
		n1=n;
		for(i=c-1;i>=0;i--)
		{
			long r=n1%10;
			a[i]=r;
			n1=n1/10;
		}
		for(i=0;i<c;i++)
		{
			if(i==(c-1))
			{
			t=a[i];
			if(t<0)
				t=t*-1;
			sum=sum+t;	
			}
			else
			{
			t=a[i]-a[i+1];
			if(t<0)
				t=t*-1;
			sum=sum+t;
			sum=sum*10;}			
		}
		System.out.println(sum);
}}
		