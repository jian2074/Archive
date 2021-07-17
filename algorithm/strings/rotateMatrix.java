import java.util.Arrays;

public class rotateMatrix {
    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length != matrix.length)
            return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - layer - 1;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] testmatrix = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 } };
        rotate(testmatrix);
        for (int i = 0; i < testmatrix.length; i++) {
            System.out.println(Arrays.toString(testmatrix[i]));
        }

    }
}
