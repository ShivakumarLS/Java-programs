public class FirstNonRepeatednum {
    
    public static void main(String[] args) {
    int [] a = {1,2,1,3,3,5,4,4};
    String str = "";
    for (int i : a)
        str+=i;
    int nonRepeated=-1;
    for(char i : str.toCharArray())
    {
        if (str.indexOf(i)==str.lastIndexOf(i))
            {
                nonRepeated=Character.getNumericValue(i);
                    break;
            }

    }
    System.out.println(nonRepeated);
    }
}
