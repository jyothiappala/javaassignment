import java.util.*;
class arraykey
{
	public static void main(String ar[])
	{
		int i,j,temp=0,c=0,k;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enter in sorting order:");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter key: ");
			k=s.nextInt();
		aa:for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.out.println(i);
				break;
			}
			else{
				temp=k;
				for(j=0;j<n;j++)
				{
					if(temp>a[j] && temp<a[j+1]){
						c=j+1;
						System.out.println(c);
						break aa;
						}
				
				}}
				
		}
	}
}