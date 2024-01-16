import java.util.*;

public class PalindromeHash {

    public static void main(String[] args) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        String str = "abadaba";
        for (int i = 0, j = str.length() - 1; i < str.length() && j > -1; i++, j--)
            hm.put(str.charAt(i), str.charAt(j));
        boolean flag = true;
        for (Map.Entry<Character, Character> entry : hm.entrySet()) {
            if (entry.getKey() != entry.getValue()) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
