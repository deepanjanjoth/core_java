class q55{
public static void main(String[] args)
{
String str="number of words in string";
int counter=0;
boolean flag=true;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch==' '){
flag=true;
continue;
}
if(flag){
counter++;
}
flag=false;
}
System.out.println(counter);
}
}