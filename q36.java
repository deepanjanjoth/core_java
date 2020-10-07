class operation{
static void multiply(int i,int j){
System.out.println("multiply="+(i*j));
}
static void multiply(float i,float j,float k){
System.out.println("Multiply= "+(i*j*k));
}
 static void multiply(Integer[] intArray) 
    { 
        int pro = 1; 
        for (int i = 0; i < intArray.length; i++)  
            pro = pro * intArray[i]; 
        System.out.println("multiply= "+pro);
    } 
static void multiply(double i,int j){
System.out.println("multiply= "+(i*j));
}
}
class q36{
public static void main(String[] args){
Integer[] intArray = {10,20};
operation.multiply(10,20);
operation.multiply(10.1f,20.2f,30.3f);
operation.multiply(10.2d,3);
operation.multiply(intArray);
}
}

