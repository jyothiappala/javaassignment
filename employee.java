class Employee
{
	long employeeId,employeePhone;
	double basicSalary,specialAllowance=250.80,hra=1000.50;
	String employeeName,employeeAddress;
	Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone)
	{
		
	}
	calculateSalary(double basicSalary,double specialAllowance)
	{
		double salary=basicSalary+(basicSalary * specialAllowance/100)+(basicSalary * hra/100);
		System.out.println(salary);
	}
}
class Manager extends Employee
{
	Manager(long id,String Name,String address,long phone,double salary)
	{
		
	}	
}
class Trainee extends Employee
{

}