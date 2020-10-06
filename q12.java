import java.util.Scanner;
class q12
{
public static void main(String... args)
{
int bs,gs,da,hra;
System.out.println("Enter salary:");
Scanner sc=new Scanner(System.in);
bs=sc.nextInt();
if(bs<10000)
{
hra=bs*10/100;
da=bs*90/100;
gs=bs+hra+da;
System.out.println("gross salary is" + gs );
}
else if(bs>=10000)
{
hra=2000;
da=bs*98/100;
gs=bs+hra+da;
System.out.println("gross salary is"+gs);
}
}
}