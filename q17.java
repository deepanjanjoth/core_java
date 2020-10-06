import java.util.Scanner;
class q17
{
public static void main(String[] args)
{
int n,rev=0,rem=0;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n/=10;
}
System.out.println("reversed number is:"+rev);
}
}
