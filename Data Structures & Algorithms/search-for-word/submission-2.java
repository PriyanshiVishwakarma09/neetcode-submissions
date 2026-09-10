class Solution {
    public boolean exist(char[][] board, String word) {
       // boolean present = false ;
       // StringBuilder sb = new StringBuilder();
      if (word.length() == 1) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == word.charAt(0)) return true;
                }
            }
            return false;
        }

       for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == word.charAt(0)){
                if(func(board , word, i , j , 1, board[i].length , board.length)){
                    return true ;
                }
                }
            }
       }
       return false ; 
    }
    public boolean func(char[][] board , String word , int i , int j , int index , int n , int m){
        if(index == word.length()){
            return true ;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        if(i-1 >= 0 && word.charAt(index) == board[i-1][j]){
            if(func(board , word , i-1 , j , index + 1 , n , m)){
                return true ;
            }
         //   func(board , word , i , j , index , n , m);
        }
        if(j + 1 < n && word.charAt(index) == board[i][j+1]){
             if(func(board , word , i , j+1 , index + 1 , n , m)){
                return true ;
            }
          //  func(board , word , i , j , index , n , m);
        }
        if(i + 1 < m && word.charAt(index) == board[i+1][j]){
             if(func(board , word , i+1 , j , index + 1 , n , m)){
                return true ;
            }
          //  func(board , word , i , j , index , n , m);
        }
        if(j-1 >= 0 && word.charAt(index) == board[i][j-1]){
             if(func(board , word , i , j-1 , index + 1 , n , m)){
                return true ;
            }
          //  func(board , word , i , j , index , n , m);
        }
        board[i][j] = temp ; 
        return false ;
    }

}
