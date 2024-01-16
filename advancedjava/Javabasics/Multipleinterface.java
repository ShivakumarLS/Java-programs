package Javabasics;


interface volume
{
    public int Volume();
}
interface mass{
    public int weight();
}

class cube implements mass,volume
{
    int wt = 10;
    int l=2, b=2 ,h=2;
    @Override
    public int Volume() {
        // TODO Auto-generated method stub
        return l*b*h;
    }
    @Override
    public int weight() {
        // TODO Auto-generated method stub
        return wt;
    }
}

interface one 
{
public void print_one();
}

interface two
{
    public void print_two();
}

interface three extends one,two
{
public void  print_three();
}

class Test implements three
{

    @Override
    public void print_one() {
       
        System.out.println("One ");
    }

    @Override
    public void print_two() {
       System.out.println("two ");
    }

    @Override
    public void print_three() {
       
        System.out.println("three");
    }
    
}

 class SolarSystem {
}
 class Earth extends SolarSystem {
}
 class Mars extends SolarSystem {
}
class Moon extends Earth {
}
public class Multipleinterface {
    public static void main(String[] args) {
        Test test= new Test();
        test.print_one();
        test.print_two();
        test.print_three();

        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Moon mn = new Moon();
 
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
        System.out.println(mn instanceof Earth );

        cube Cube = new cube();
        System.out.println(Cube.Volume());
        System.out.println(Cube.weight());
        
    }
    
}
