class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int ro = grid.length ;
        int co = grid[0].length ; 
        boolean[][] visited = new boolean[ro][co];
        for(int i = 0 ; i < ro ; i++){
            for(int j = 0 ; j < co ; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i , j});
                }
            }
        }
       // if(q.size() == 0 ) return -1;
        int count = 0 ;
        int[][] dirs = {{ -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }};
        while(!q.isEmpty()){
            int size = q.size();
            int i = 0 ;
            for(int k = 0 ; k < size ; k++){
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];
                for (int[] dir : dirs) {
                    int r = row + dir[0];
                    int c = col + dir[1];
                    if (r >= ro || c >= co || r < 0 || c < 0 || grid[r][c] != 1) {
                        continue;
                    }
                    q.add(new int[] { r, c });
                    grid[r][c] = 2 ;
                    i = 1 ;
                }
            }
            if(i == 1){
                count++;
            }
        }
        for(int j = 0 ; j < ro ; j++){
            for(int s = 0 ; s < co ; s++){
                if(grid[j][s] == 1){
                    return -1 ;
                }
            }
        }
        return count ; 
    }
}
