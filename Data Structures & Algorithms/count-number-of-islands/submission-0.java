class Solution {
    boolean[][] visited ;
    public int numIslands(char[][] grid) {
        int row = grid.length ;
        int col = grid[0].length ;
        visited = new boolean[row][col];
        int count = 0;
        for(int i =0 ; i  < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count += 1 ;
                    func(grid , i , j);
                }
            }
        }
        return count ;
    }
    public void func(char[][] grid , int row , int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1'){
            return ;
        }
        if(visited[row][col]){
            return ;
        }
        visited[row][col] = true;
        func(grid , row + 1 , col);
        func(grid , row - 1 , col);
        func(grid , row , col + 1);
        func(grid , row , col - 1);
    }
}
