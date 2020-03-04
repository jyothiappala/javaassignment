import java.util.Scanner;
class TaxCalculator
{
	
	public static void main(String ar[])
	{
		EmployeeTax obj1=new EmployeeTax();
		obj1.calculateTax(25000);
		obj1.deductTax(25000);
		obj1.validateSalary(true,25000);
		EmployeeTax obj2=new EmployeeTax();
		obj1.calculateTax(125000);
		obj1.deductTax(125000);
		obj1.validateSalary(true,125000);
	}
}
class EmployeeTax
{
	float basicSalary;
	int nettsSalary;
	boolean citizenship;
	float tax;
	void calculateTax(float basicSalary)
	{
		this.tax=30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+basicSalary+" "+tax);	
	}
	void deductTax(float basicSalary)
	{
		nettsSalary=(int)basicSalary-(int)tax;
		System.out.println("the nett salary of employee "+nettsSalary);
	}
	void validateSalary(boolean citizenship,float basicSalary)
	{
		System.out.println("The salary and citizenship eligibility: ");
		if(basicSalary>100000 && citizenship==true)
		{
			System.out.println("true");	
		}
		else
		{
			System.out.println("false");	
		}
	}
}