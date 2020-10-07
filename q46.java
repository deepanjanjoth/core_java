class Person{
}
class Employee extends Person{
}
class Manager extends Employee{
}

class q46{
public static void main(String[] args)
{
Person p=new Employee();
System.out.println(p instanceof Person);
System.out.println(p instanceof Employee);

System.out.println(p instanceof Manager);
}
}


