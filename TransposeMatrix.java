import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
        })));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] resultMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[j][i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }
}
