package target150.after150;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands200 {

    public static void main(String [] args) {
//        char [][] grid = new char[][] {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}

        char [][] grid = new char[][] {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        NumberOfIslands200 isLands = new NumberOfIslands200();
        int numberOfIslands = isLands.numIslands(grid);
        System.out.println("Number of Islands : "+numberOfIslands);
    }

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    BFSTraverse(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void BFSTraverse(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        int rows = grid.length;
        int cols = grid[0].length;
        while (!queue.isEmpty()) {
            int [] temp = queue.poll();
            int r = temp[0];
            int c = temp[1];

            if(r < 0 || c < 0 || r >=rows || c>= cols || visited[r][c] || grid[r][c] != '1')
                continue;
            visited[r][c] = true;
            queue.add(new int[]{r,c-1});
            queue.add(new int[] {r,c+1});
            queue.add(new int[]{r-1,c});
            queue.add(new int[]{r+1,c});
            }
        }
    }
