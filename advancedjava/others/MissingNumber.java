import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        
        int [] a = {1,2,4,3,5,6,7,8,9,10,11,15,13,12};
        Arrays.sort(a);
        int n = a.length+1;
        int sumOfAll= n*(n+1)/2;
        int sumOfArray = Arrays.stream(a).sum();

        int missing = sumOfAll-sumOfArray;

        System.out.println(missing+" is the missing integer");

    }
    
}
