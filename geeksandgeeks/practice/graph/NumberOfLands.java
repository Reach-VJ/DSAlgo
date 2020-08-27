package com.reachingskies.geeksandgeeks.practice.graph;

public class NumberOfLands {

    public static void main(String [] args) {
        char [][] grid = {
                          {'1','1','1','1','0'},
                          {'1','1','0','1','0'},
                          {'1','1','0','0','1'},
                          {'0','0','0','0','1'}
                         };
        NumberOfLands numberOfLands = new NumberOfLands();
       int noOfIslands =  numberOfLands.numberOfIslands(grid);

       System.out.println("Number of Islands --> "+noOfIslands);

    }

    int numberOfIslands(char [][] grid) {

        int noOfIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    noOfIslands++;
                    dfs(grid,i,j);
                }
            }
        }
        return noOfIslands;
    }

    void dfs(char [][] grid, int rPosition, int cPosition) {

        if(rPosition < 0 || cPosition < 0 || rPosition > grid.length-1 || cPosition > grid[0].length-1 || grid[rPosition][cPosition] == '0')
            return;

        grid[rPosition][cPosition] = '0';
        dfs(grid,rPosition,cPosition-1);
        dfs(grid,rPosition, cPosition+1);
        dfs(grid, rPosition-1,cPosition);
        dfs(grid,rPosition+1,cPosition);
    }
}
