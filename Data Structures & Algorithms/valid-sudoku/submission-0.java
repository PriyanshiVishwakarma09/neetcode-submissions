class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>(); 
        HashMap<Character , Integer> map3 = new HashMap<>();
        //column check
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                if (board[i][j] == '.') continue;
                if(map.containsKey(board[i][j])){
                    return false ;
                }
                map.put(board[i][j] , 1);
            }
            map.clear();
        }
        //row check
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                if (board[j][i] == '.') continue;
                if(map2.containsKey(board[j][i])){
                    return false ;
                }
                map2.put(board[j][i] , 1);
            }
            map2.clear();
        }
        //3x3 box check 
        for(int i = 0 ; i < board.length ; i+=3){
            for(int j = 0 ; j < board.length ; j+=3) {
                   map3.clear();
                for(int p = i ; p < i+3 ; p++){
                    for(int q = j ;  q < j+3 ; q++){
                        if (board[p][q] == '.') continue;
                        if(map3.containsKey(board[p][q])){
                            return false ;
                        }
                        map3.put(board[p][q] , 1);
                    }
                }
               // map3.clear();
            }
           // map3.clear() ;
        }
    return true ;
    }
}
