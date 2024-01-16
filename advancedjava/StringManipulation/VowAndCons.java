package StringManipulation;



public class VowAndCons {

    static public void findVowelsAndConsonants(String string) {
        int[] charCount = new int[2];
        char[] carray = string.toCharArray();
        for (char c : carray) {
            if (Character.isAlphabetic(c)) {
                if ("abcdefABCDEF".contains("" + c))
                    charCount[0] += 1;
                else
                    charCount[1] += 1;
            }
        }
        System.out.println("vowelCount : "+charCount[0]);
        System.out.println("consonantcount : "+charCount[1]);
    }

    public static void main(String[] args) {
findVowelsAndConsonants("asfjkhbjdfopiu123465");
    }
}
