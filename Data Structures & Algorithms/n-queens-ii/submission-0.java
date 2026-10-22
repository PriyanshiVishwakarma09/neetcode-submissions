class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        func(list , n , board , 0 );
        return count ;
        
    }
    public void func(List<List<String>> list , int n , char[][] board , int i){
        if(i == n){
           List<String> ans = new ArrayList<>();
            for (int r = 0; r < n; r++) {
                ans.add(new String(board[r]));
            }
            list.add(ans);
            count++;
            return ;
        }
        for(int p = 0 ; p < n ; p++){
            if(check(board , i , p , n)){
                board[i][p] = 'Q';
                func(list , n , board , i+1);
                board[i][p] = '.';
            }
        }
    }
    public boolean check(char[][] board, int i , int j , int n){
        int p = i-1 ;
        int q = j-1 ;
        while(p >= 0 && q >= 0){
            if(board[p][q] == 'Q'){
                return false ;
            }
            p--;
            q--;
        }
        p = i-1 ;
        q = j ;
        while(p >= 0){
            if(board[p][q] == 'Q'){
                return false; 
            }
            p-- ;
        }
        p = i-1 ;
        q = j+1 ;
        while(p >= 0 && q < n){
            if(board[p][q] == 'Q'){
                return false ;
            }
            p--;
            q++;
        }
        return true ;   
    }
}