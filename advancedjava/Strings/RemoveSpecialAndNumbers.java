package Strings;

public class RemoveSpecialAndNumbers {

    public static String remove(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char cur = string.charAt(i);
            if (Character.isAlphabetic(cur))
                result.append((Character.isLowerCase(cur)) ? Character.toUpperCase(cur) : Character.toLowerCase(cur));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("aBc1237689*&^()(nkjhl4"));
    }
}
