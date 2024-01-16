package search;

public class LinearSearch {
    public static String linearSearch(int[] a, int n) {
        boolean flag = false;
        int searchfor = n;
        for (int i : a)
            if (i == searchfor)
                flag = true;
        if (flag == true)
            return "Search Successful";
        return "Search Unsuccessful";

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 5, 2, 9, 10, 11, 12, 2, 4 };
        int searchfor = 89;
        System.out.println(linearSearch(arr, searchfor));

    }

}
