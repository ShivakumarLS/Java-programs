package Javabasics;

abstract class shape{
    abstract double area();
    public abstract  String toString();
    public String color;
    public String newString(String str)
    {
        return  String.valueOf(new StringBuffer(str).reverse());
    }

    shape(String color)
    {
        this.color = color;
    }
}

class Circle extends shape{

    private double radius;
    Circle(String color,double radius)
    {
        super(color);
        this.radius=radius;
       
    }
    @Override
    double area() {
       
        
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
       return "area is "+ area();
    }
    
}
class rectangle extends shape
{
    private int l,b;

    rectangle(String color,int l ,int b)
    {
        super(color);
        this.l=l;
        this.b=b;
    }
    @Override
    double area() {
        
        return l*b;
    }
    
    @Override
    public String toString() {
       return "area is "+ area();
    }
}
public class abstraction {
    public static void main(String[] args) {
        shape sh = new Circle("red",2);
    
    System.out.println(sh.toString());    
    shape rect = new rectangle("black",2,7);
    rect.toString();
    }

    
}
