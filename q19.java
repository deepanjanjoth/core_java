import java.util.Scanner;
import java.lang.Math;
class q19
{
static double powAdd;
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();

double pow;
System.out.println("series:");
for(int i=1;i<n;i++)
{
pow=Math.pow(i,2);
powAdd=powAdd+pow;
System.out.println(" "+pow);
}
System.out.println("addition of series"+powAdd);
}
}
