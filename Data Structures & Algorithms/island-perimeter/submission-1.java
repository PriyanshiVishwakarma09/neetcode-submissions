class Solution {
    boolean[][] visited ; 
    public int islandPerimeter(int[][] grid) {
         int par = 0 ;
         int n = grid.length ;
         int m = grid[0].length ;
         visited = new boolean[n][m];
         for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    return dfs(grid , i , j , n , m);
                }
            }
         }
         return 0 ; 
    }
    public int dfs(int[][] grid , int i , int j , int n , int m){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0){
            return 1;
        }
        if(visited[i][j] == true){
            return 0 ;
        }
        visited[i][j] = true ;
        return dfs(grid , i+1 , j , n, m) + dfs(grid ,i-1 , j , n , m) + dfs(grid ,i , j+1 , n , m) + dfs(grid , i , j-1 , n , m);
    }

}