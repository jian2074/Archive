import java.util.Arrays;

public class zeroMatrix {
    static void transform(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (row[i])
                nullifyRow(matrix, i);
        }

        for (int j = 0; j < matrix.length; j++) {
            if (col[j])
                nullifyCol(matrix, j);
        }

    }

    static void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    static void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] testmatrix = { { 1, 2, 0, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 0, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 } };
        for (int i = 0; i < testmatrix.length; i++) {
            System.out.println(Arrays.toString(testmatrix[i]));
        }
        transform(testmatrix);
        for (int i = 0; i < testmatrix.length; i++) {
            System.out.println(Arrays.toString(testmatrix[i]));
        }
    }
}
