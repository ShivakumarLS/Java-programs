public class oddeven {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println("even numbers are :");
        for (int i : arr)
            if (i % 2 == 0)
                System.out.print(i + ",");
        System.out.println();
        System.out.println("odd numbers are :");
        for (int i : arr)
            if (i % 2 == 1)
                System.out.print(i + ",");

    }
}