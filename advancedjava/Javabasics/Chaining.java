package Javabasics;

public class Chaining {

    int id, age;
    String name  ;
    Chaining(int id)
    {
        this.id=id;
    }

    Chaining(int id,int age)
    {
        this(id);
        this.age=age;
    }
    Chaining(int id,int age ,String name)
    {
        this(id, age);
        this.name=name;
    }
    
    public static void main(String[] args) {
        Chaining emp1 = new Chaining(1,23); 
       Chaining emp2 = new Chaining(1,23,"aba"); 
        System.out.println(emp2.id+" "+emp2.age+" "+emp2.name+" ");
           System.out.println(emp1.id+" "+emp1.age+" "+emp1.name+" ");
    }
}
