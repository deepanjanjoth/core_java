class q57{
String s="this is java";
char ar[]=s.tocharArray();
int f=0,l=0;
for(int i=0,i<ar.length;i++){
if(ar[i]==' ' || i==ar.length-1;i++){
l=(ar[i]=='')?i-1:1;
while(l>f){
char temp=ar[i]);
ar[l]=ar[f];
ar[f]=temp;
i--;
f++;
}
f=i+1;

}
}
System.out.println(new String(ar));
}