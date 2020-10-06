import java.util.Scanner;
class q15
{

public static void main(String[] args)
{
System.out.println("enter gender(m or f)");
Scanner sc=new Scanner(System.in);
char g=sc.next().charAt(0);
System.out.println("enter age");
int a=sc.nextInt();
System.out.println("you entered gender= " + g+ "and age="+a);
if(g=='m' && a>21 || g=='f' && a>18 )
{
System.out.println("eligible for marriage");
}
else
{
System.out.println("Not Eligible for marriage");
}
}
}
