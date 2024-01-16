package StringManipulation;



public class PrintNonDuplicates {

    public static String removeRecurring(String string) {
    //     HashMap<Character, Integer> countMap = new HashMap<>();
    //     StringBuffer result = new StringBuffer();
    //     for (char c : string.toCharArray())
    //         countMap.put(c, countMap.getOrDefault(c, 0) + 1);

    //     for (char c : countMap.keySet())
    //         result.append((countMap.get(c) == 1) ? c : "");

    //     return result.toString();
    // }
    StringBuffer result = new StringBuffer();
    char [] carray  = string.toCharArray();
    for(char c : carray)
    result.append((string.indexOf(c)==string.lastIndexOf(c))? c: "");
return result.toString();    
}

    public static void main(String[] args) {
        String string = new String("sasdBCDEFFFF");
        System.out.println("The original string is: " + string);
        // System.out.print("The non-duplicate characters are : ");
        System.out.println(removeRecurring(string));
    }
}
