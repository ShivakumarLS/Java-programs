import java.util.HashSet;
import java.util.Set;

public class VandC {

    public static void main(String[] args) {
      String str = "THere ate lskdjfnlmcvb";
       String vow="aeiouAEIOU";
       String cons="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
       Set<Character> vowels = new HashSet<Character>();
      for (char i : vow.toCharArray())
       {
        vowels.add(i);
       }
     Set<Character> consonants = new HashSet<Character>();
        for (char i : cons.toCharArray())
       {
        consonants.add(i);
       }
      System.out.println("vowels present are");
       for (char i : str.toCharArray())
       {
        if(vowels.contains(i))
            System.out.println(i);

       }
        System.out.println("consonants present are");
       for (char i : str.toCharArray())
       {
        if(consonants.contains(i))
            System.out.println(i);

       }

    }

}
