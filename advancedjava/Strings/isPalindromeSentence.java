package Strings;

import java.util.Scanner;

public class isPalindromeSentence {
boolean isPalindromicSentence(String s)
{
    StringBuffer res = new StringBuffer();
    for ( char i : s.toCharArray())
        if(Character.isLetterOrDigit(i))
            res.append(Character.toLowerCase(i));
    return isPalindromeWord(res.toString());

}
boolean isPalindromeWord(String str)
{
    StringBuffer sb = new StringBuffer(str);
    return sb.reverse().toString().equals(str);
}
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    String  input = scanner.nextLine(); 
    System.out.println(new isPalindromeSentence().isPalindromicSentence(input));
    scanner.close();
} 
}
