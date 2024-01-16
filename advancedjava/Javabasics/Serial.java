package Javabasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class demo implements Serializable
{
    int a ,b;
    public demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    
}
public class Serial {
    
    public static void main(String[] args) {
        
        demo Demo = new demo(1, 2);
        String filename = "serial.ser";

        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(Demo);

            out.close();
            file.close();
            System.out.println("serialised");

        }
        catch(IOException e){System.out.println("IOException occured");}

        demo Demo1 = null;
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            Demo1 = (demo)in.readObject();

            in.close();
            file.close();
            System.out.println("deserialised");
            System.out.println(Demo1.a+" "+Demo1.b);

        }
        catch(ClassNotFoundException f) {System.out.println(f);}
        catch(FileNotFoundException f){System.out.println(f);}
        catch(IOException i){System.out.println(i);}

    }
}
