import java.util.Scanner;
class INT
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		double num=s.nextFloat();
		int num1=(int)num;
		double num2=num-num1;
		System.out.println(num1+"   "+num2);
	}
}