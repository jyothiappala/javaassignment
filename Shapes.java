import java.util.Scanner;
class Circle
{
	void calculateArea(int length)
	{
		float Area=(22/7)*length*length;
		System.out.println("Area : "+Area);
	}
}
class Square
{
	void calculateArea(int length)
	{
		float Area=length*length;
		System.out.println("Area : "+Area);
	}
}
class Triangle
{
	void calculateArea(int length)
	{
		float Area=(1/2)*length*length;
		System.out.println("Area : "+Area);
	}
}
class Shapes
{
	int numberOfSides;
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter sides");
		int numberOfSides=s.nextInt();
		System.out.println("enter length");
		int length=s.nextInt();
		calculateShapeArea(numberOfSides,length);
	}
	static void calculateShapeArea(int numberOfSides,int length)
	{
		Circle obj=new Circle();
		Square obj2=new Square();
		Triangle obj1=new Triangle();
		if(numberOfSides==1)
			obj.calculateArea(length);
		else if(numberOfSides==3)
			obj1.calculateArea(length);
		else if(numberOfSides==4)
			obj2.calculateArea(length);
		else
			System.out.println("No Shape");
	}
}