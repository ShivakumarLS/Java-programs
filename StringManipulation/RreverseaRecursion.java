package StringManipulation;

public class RreverseaRecursion {
static public String  reverse(String inputStr)
{
    if (inputStr.length() <= 1) {
            return inputStr;
        }

        // Recursive case: reverse the substring excluding the first character,
        // and concatenate the first character at the end
        System.out.println(reverse(inputStr.substring(1)) + inputStr.charAt(0));
        return reverse(inputStr.substring(1)) + inputStr.charAt(0);
}

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverse(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
