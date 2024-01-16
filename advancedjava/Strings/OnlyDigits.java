package Strings;

import java.util.Scanner;

public class OnlyDigits {
    static public boolean onlyDigits(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    static private boolean isOnlyDigits(String str) {
        for (char c : str.toCharArray())
            if (!Character.isDigit(c))
                return false;

        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println((isOnlyDigits(str)));
        scanner.close();
    }
}
