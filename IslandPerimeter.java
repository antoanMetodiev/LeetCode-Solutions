public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{
//                {0,1,0,0},
//                {1,1,1,0},
//                {0,1,0,0},
//                {1,1,0,0},
                {1, 0}
        }));
    }

    public static int islandPerimeter(int[][] grid) {
        int allBounds = 0;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {

                    int initialBounds = 4;

                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) initialBounds--;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) initialBounds--;

                    if (i + 1 < grid.length && grid[i + 1][j] == 1) initialBounds--;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) initialBounds--;

                    allBounds += initialBounds;
                }
            }
        }
        return allBounds;
    }
}
