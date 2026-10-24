class Solution {
    boolean[][] visited ;
    int[][] dir = {{-1 ,0 } , {+1 , 0} , {0 , -1}, {0 , +1}};
    public void solve(char[][] board) {
        int row = board.length ;
        int col = board[0].length ; 
        visited = new boolean[row][col];
        for(int i = 0 ; i < row ;i++){
            if(board[i][0] == 'O' || board[i][0] == 'P'){
                func(board , i , 0 , row , col);
            }
        }
        for(int j = 0 ; j < col ; j++){
            if(board[0][j] == 'O' || board[0][j] == 'P'){
                func(board ,  0 , j , row , col);
            }
        }
        for(int i = 0 ; i < row ; i++){
            if(board[i][col-1] == 'O' || board[i][col-1] == 'P'){
                func(board ,i , col-1 , row , col);
            }
        }
        for(int j = 0 ; j < col ; j++){
            if(board[row-1][j] == 'O' || board[row-1][j] == 'P'){
                func(board , row-1 , j , row , col);
        }
        for(int i = 0; i < row ; i++){
            for(int l = 0 ; l < col ; l++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        for(int i = 0; i < row ; i++){
            for(int l = 0 ; l < col ; l++){
                if(board[i][j] == 'P'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    }
    public void func(char[][] board , int i , int j , int row , int col){
        if(visited[i][j]){
            return ;
        }
        board[i][j] = 'P';
        visited[i][j] = true ;
        for(int[] d : dir){
            int r = d[0] + i;
            int c = d[1] + j;
            if(r >  row - 1 || c > col -1 || r < 0 || c < 0 || board[r][c] == 'X'){
                continue ;
            }
            func(board , r , c , row, col);    
        }
    }
}
