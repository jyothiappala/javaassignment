import java.util.Scanner;
class SimpleInterestCalculator
{
	void calculateSimpleInterest(double p,int n)
	{
		if(p>100000 && numberofyears>10)
		{
			double Simpleinterest=p*n*10/100;
			System.out.println("The interest amount for a principle of "+p+" year "+n+" "+Simpleinterest);
		}
		else if(p>100000 && numberofyears<10)
		{
			double Simpleinterest=p*n*9.5/100;
			System.out.println(Simpleinterest);
		}
		else if(p<100000 && numberofyears>10)
		{
			System.out.println(Simpleinterest);
			double Simpleinterest=p*n*5/100;
		}
		else if(numberofyears<5)
		{
			System.out.println(Simpleinterest);
			double Simpleinterest=p*n*4.5/100;
		}
	}
}
class interest
{
	double principleamount;
	int numberofyears;
	public static void main(String ar[])
	{
		SimpleInterestCalculator obj=new SimpleInterestCalculator();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		principleamount=s.nextFloat();
		System.out.println("Enter years amount:");
		numberofyears=s.nextInt();
		obj.calculateSimpleInterest(principleamount,numberofyears);
	}
}