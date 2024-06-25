import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckIfMatrixIsX_Matrix {
    public static void main(String[] args) {
        System.out.println(checkXMatrix(new int[][] {
                {6,0,19},
                {0,2,0},
                {13,17,6},
        }));
    }

    public static boolean checkXMatrix(int[][] grid) {
        if (!checkElsInTheDiagonals(grid)) return false;
        if (!checkElsInAllOtherPlaces(grid)) return false;
        return true;
    }

    private static boolean checkElsInAllOtherPlaces(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {

            if (i == 0 || i == grid.length - 1) {
                for (int j = 1; j <= grid.length - 2; j++) {
                    if (grid[i][j] != 0) return false;
                }
                continue;
            }

            // we check first and last number:
            if (grid[i][0] != 0 || grid[i][grid.length - 1] != 0) return false;

            // we check if array have more than 2 numbers different on 0 (each array can have only 2 numbers different on 0 in this case):
            if(grid.length > 3 && Arrays.stream(grid[i]).boxed().filter(num -> num != 0).collect(Collectors.toList()).size() >= 3) return false;
        }
        return true;
    }

//            [2,0,0,1]
//            [0,3,1,0]
//            [0,5,2,0]
//            [4,0,0,2]

    private static boolean checkElsInTheDiagonals(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == 0 || grid[i][grid.length - 1 - i] == 0) return false;
        }
        return true;
    }
}
