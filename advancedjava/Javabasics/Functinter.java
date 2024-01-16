package Javabasics;

@FunctionalInterface
interface A{

    void Show();
}
public class Functinter {
    public static void main(String[] args) {
        A obj = ()-> {System.out.println("hello");
    System.out.println("There");};
        obj.Show();

    }
}
