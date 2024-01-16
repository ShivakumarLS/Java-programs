import java.util.Arrays;

public class MaxEle {

    public static int maxUsingForLoop(int[] arr) {

        if (arr.length == 0)
            return -1;

        if (arr.length == 1)
            return arr[0];

        int max = -2147483648;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int maxUsingBuiltIn(int[] arr) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,9,7};
        int fl = maxUsingForLoop(arr);
        int bi = maxUsingBuiltIn(arr);
        if(fl==-1) 
            System.out.println("no elements in the array");
        else{
        System.out.println(fl+ " is the highest integer");
        System.out.println(bi+ " is the highest integer");
    }
}

}
