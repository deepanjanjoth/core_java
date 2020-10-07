class Light{
private int watt;
Light()
{
System.out.println("no arg:light");
}
Light(int watt){
System.out.println("parameterized light");
}
}
class TubeLight extends Light{
private int Light;

TubeLight(){
System.out.println("no-arg:TubeLight");
}
TubeLight(int watt,int Light){
System.out.println("parameterized tubelight");
}
}
class q47{
public static void main(String[] args){

TubeLight t=new TubeLight();
TubeLight r=new TubeLight(100,20);
}
}