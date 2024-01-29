
class Parent {
    String parent = "parent";

    Parent(String parent) {
        this.parent = parent;
    }

    public String getParent() {
        return this.parent;
    }

    static void display() {
        System.out.println("Parent Display");
    }

    static void display(String str2 ,String str1)
    {
        System.out.println(str2+str1);
    }
}

class Child extends Parent {
    private String child = "Child";

    Child(String child) {
        super(child);
    }

    @Override
    public String getParent() {
        return this.child;
    }

    
    void display(String str)
    {
        System.out.println( "Child display");
    }
}

public class Practice {
    public static void main(String[] args) {
        Parent parent = new Parent("parent1");
        Child child1 = new Child("child1");
        System.out.println(parent.getParent());
        System.out.println(child1.getParent());
        Parent.display();
        child1.display();
    }

}
