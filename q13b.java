import java.util.Scanner;
class q13b
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println(a+ " "+b+ " "+c);
String s = (a>b) && (a>c) ? a+" is greater" : b + " is greatest";
		System.out.println(s);
}
}
