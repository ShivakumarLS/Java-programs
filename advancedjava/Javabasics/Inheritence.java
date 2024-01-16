package Javabasics;

class Employee{
    int salary;
    Employee(int salary)
    {
        this.salary=salary;
    }
}

class Engineer extends Employee
{
    int benefits;
    Engineer(int salary,int benefits)
    {
        super(salary);
        this.benefits=benefits;
    }
    public String toString()
    {
        return "Salary :" + this.salary+" benefits :"+this.benefits;
    }
}

class Base
{
    int x ;
    Base(int x)
    {
        this.x = x;
    }
}
class Derived extends Base
{
    int y;
    Derived(int x , int y)
    {
        super(x);
        this.y=y;
    }
    public void display()
    {
        System.out.println(x+" "+y);
    }
}
public class Inheritence {
public static void main(String[] args) {
    
    Derived  der = new Derived(4,6);
    der.display();
    Engineer emp = new Engineer(10000, 2100);
    System.out.println(emp.toString());
    
}
    
}
