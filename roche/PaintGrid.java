package com.reachingskies.interview.roche;

import java.lang.reflect.Array;
import java.util.*;

public class PaintGrid {
    public static void main(String[] args) {
        PaintGrid paintGrid = new PaintGrid();
        System.out.println("\n" +
                "Printing grid before painting \n");
        //paintGrid.printGrid(paintGrid.createGrid());
        //paintGrid.paintGrid(paintGrid.createGrid(),4,4);
        paintGrid.printGridList(paintGrid.createGridList());
        paintGrid.paintGridList(paintGrid.createGridList(),4,4);
    }

    void paintGrid(int [][] grid, int x, int y) {

        boolean [][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        while(!queue.isEmpty()) {
            int [] temp = queue.poll();
            int row = temp[0];
            int col = temp[1];
            if(row < 0 || col < 0 || row >=grid.length || col >=grid[0].length || visited[row][col] || grid[row][col] == 1)
                continue;
            visited[row][col] = true;
            grid[row][col] = 1;
            queue.add(new int[]{row,col-1});
            queue.add(new int[]{row,col+1});
            queue.add(new int[]{row+1,col});
            queue.add(new int[]{row-1,col});
        }
        System.out.println("\n Printing grid after paint \n");
        printGrid(grid);
    }

    void paintGridList(List<List<Integer>> gridList, int x, int y) {

        boolean [][] visited = new boolean[gridList.size()][gridList.get(0).size()];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        while(!queue.isEmpty()) {
            int [] temp = queue.poll();
            int row = temp[0];
            int col = temp[1];
            if(row < 0 || col < 0 || row >=gridList.size() || col >=gridList.get(0).size() || visited[row][col] || gridList.get(row).get(col) == 1)
                continue;
            visited[row][col] = true;
            gridList.get(row).set(col,1);
            queue.add(new int[]{row,col-1});
            queue.add(new int[]{row,col+1});
            queue.add(new int[]{row+1,col});
            queue.add(new int[]{row-1,col});
        }
        System.out.println("\n Printing grid after paint \n");
        printGridList(gridList);
    }

    int[][] createGrid() {
        int[][] grid = new int[][]
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}
                };
        return grid;
    }

    List<List<Integer>> createGridList() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 1, 1, 1, 1, 1, 1, 0));
        grid.add(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 1, 1, 1, 1, 1, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
        return grid;
    }

    void printGrid(int [][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                System.out.print(" "+grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    void printGridList(List<List<Integer>> gridList) {
        if(gridList == null || gridList.size() == 0 )
            return;

        for(int i = 0; i < gridList.size(); i++) {
            for(int j = 0; j < gridList.get(i).size(); j++) {
                System.out.print(" "+gridList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
