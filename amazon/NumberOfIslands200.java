package com.reachingskies.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands200 {

    public static void main(String[] args) {
//        char [][] grid = new char[][] {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}

        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumberOfIslands200 isLands = new NumberOfIslands200();
        int numberOfIslands = isLands.numIslands(grid);
        System.out.println("Number of Islands : " + numberOfIslands);
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count = count+1;
                    DFSTraverse(grid,i,j);
                }
            }
        }

        return count;
    }

    void DFSTraverse(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        DFSTraverse(grid,i,j+1);
        DFSTraverse(grid,i,j-1);
        DFSTraverse(grid,i+1,j);
        DFSTraverse(grid,i-1,j);
    }
}
