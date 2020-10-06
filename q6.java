import java.util.Scanner;
class q6{
	public static void main(String[] args)
	{
	double area;
	double pi=3.142;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius");
	double radius=sc.nextDouble();
	 area=pi*radius*radius;
	System.out.println("area of circle is"+area);
	double circumference=2*pi*radius;
	System.out.println("circumference is"+circumference);
	}
	}
	