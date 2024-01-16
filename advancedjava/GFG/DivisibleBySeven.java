package GFG;

public class DivisibleBySeven {

    static boolean isDivisibleBySeven(int num) {
        if (num < 0)
            return isDivisibleBySeven(-num);
        if (num == 7 || num == 0)
            return true;
        if (num < 10)
            return false;

        int val = num / 10;
        return isDivisibleBySeven(val - 2 * (num - val * 10));
    }

    public static void main(String[] args) {
        int n = 896;
        System.out.println("Is " + n + " divisible by 7?\n" + (isDivisibleBySeven(n) ? "Yes" : "No"));
    }
}
