import java.util.Scanner;
class q14
{
public static void main(String[] args)
{int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter a year to check if it's a leap year");
year=sc.nextInt();
if(year%4==0)
{
System.out.println("year is leap");
}
else
{
System.out.println("it is not a leap year");
}
}
}