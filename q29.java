class q29{
public static void main(String[] args)
{
int a[]={11,12,13};
int b[]={21,22};
int coll[]=new int[2][];
coll[0]=a;
coll[b]=b;
for(int i=0;i<coll.length;i++){
for(int j=0;j<coll[i].length;j++){
System.out.println(coll[i][j]+" ");
}
System.out.println("");
}
}
}