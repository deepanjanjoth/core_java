class q56{
public static void main(String[] args)
{
String str="ram shiv hari";
char arr=s.toCharArray(i);
boolean flag="true";
for(int i=0;i<arr.length;i++){
if(arr[i]=' '){
flag=true;
continue;
}
if(flag){
if(arr[i]>=97&&arr[i]<=122){
arr[i]-=32;
}
}
flag=false;
}
System.out.println(new String (arr));
}
}
