import java.util.Scanner;
class q10
{
public static void main(String[] args)
{
int c,f;
Scanner sc=new Scanner(System.in);
System.out.println("enter temperature in farenhite");
f=sc.nextInt();
c=5*(f-32)/9;
System.out.println("temperature in celsius is"+c);
}
}