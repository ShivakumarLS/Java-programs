package StringManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllPermutations {
    final static List<String> result = new ArrayList<>();

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("All permutations of the string:");
        generatePermutations(input);
        System.out.println(result);
        scanner.close();
    }

    private static List<String> generatePermutations(String input)
    {
        generatePermutationsHelper("", input);
        return result;
    }

    private static void generatePermutationsHelper(String prefix, String word)
    {
        int n = word.length();
        if (n == 0) 
            result.add(prefix);

        else 
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + word.charAt(i);
                String newRemaining = word.substring(0, i) + word.substring(i + 1);
                generatePermutationsHelper(newPrefix, newRemaining);
            }        
    }
}
