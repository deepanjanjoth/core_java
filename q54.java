class q54
{
public static void main(String[] args)
{
String s="this is java";
char ar[]=s.toCharArray();
for(int i=0,j=ar.length-1;i<j;i++,j--){
char temp=ar[j];
ar[j]=ar[i];
ar[i]=temp;
}
System.out.println(new String(ar));
}
}
