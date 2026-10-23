class Solution {
    boolean[][] visited ;
   
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length ;
        int col = grid[0].length ;
        visited = new boolean[row][col];
        int count = 0 ;
        for(int i =0 ; i  < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    count = Math.max(func( grid , i , j ) , count) ;
                }
            }
        }
        return count ;
    }
    public int func( int[][] grid , int row , int col){
         if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1){
            return 0;
        }
        if(visited[row][col]){
            return 0;
        }
        visited[row][col] = true;
        return 1 + func(grid , row + 1 , col) + func(grid , row - 1 , col)+  func(grid , row , col + 1) + func(grid , row , col - 1);
    }
}
