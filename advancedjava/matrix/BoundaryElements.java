package matrix;

import java.util.Arrays;

public class BoundaryElements {

    public static void printBoundary(int a[][], int row, int column) {
        if (row == 1)
            Arrays.stream(a[0]).forEach(i -> System.out.print(i + " "));

        if (column == 1) {
            for (int i = 0; i < row; i++)
                System.out.print(a[i] + " ");
        }

        else {
            for (int i = 0; i < column; i++)
                System.out.print(a[0][i] + " ");
            for (int i = 1; i < row; i++)
                System.out.print(a[i][column - 1] + " ");
            for (int i = column - 2; i >= 0; i--)
                System.out.print(a[row - 1][i] + " ");
            for (int i = row - 2; i > 1; i--)
                System.out.print(a[i][0] + " ");
        }
    }

    public static void main(String[] args) {

        int[][] a = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
        for (int i = 0; i < 3; i++) {
            Arrays.stream(a[i]).forEach(j -> System.out.print(j + " "));
            System.out.println();
        }

        printBoundary(a, 3, 4);

    }
}
