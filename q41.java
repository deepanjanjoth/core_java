class Foo{
Foo(){

System.out.println("no-arg");
}
Foo(int i) {
this();
System.out.println("parameterized");
}
}
class q41{
public static void main(String[] args){
Foo f=new Foo(10);
}

}
