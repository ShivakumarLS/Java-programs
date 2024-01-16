package matrix;

import java.util.Arrays;


public class Rotateby90 {
    static Transpose tr = new Transpose();
    static final int N = 4;

    static void rotate(int[][] mat) {
        int[][] temp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = temp[j][N - i - 1];
            }
        }
    }

    public static void main(String[] args) {

        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        rotate(A);
        for (int i = 0; i < N; i++) {
            Arrays.stream(A[i]).forEach(j -> System.out.print(j + " "));
            System.out.println();
        }
    }

}
