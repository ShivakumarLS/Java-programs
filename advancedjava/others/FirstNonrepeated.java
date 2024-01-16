
public class FirstNonrepeated {
    
    public static void main(String[] args) {
    
        String str = "aabbcddeff";
        char [] sortred = str.toCharArray();
        char rep =' ';
        for(char i : sortred)
        {
        if (str.indexOf(i) == str.lastIndexOf(i))
            {
                rep = i;
            break;
            }    
    }

        if (rep==' ')
            System.out.println("all letters are repeating");
        else 
        System.out.printf("first non repeating character is %c",rep);
        
    }
    
}
