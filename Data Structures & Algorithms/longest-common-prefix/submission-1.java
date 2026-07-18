class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int p = Integer.MAX_VALUE ;
         for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() < p){
                p = strs[i].length();
            }
        }
        for(int i = 0 ; i < p ; i++){
            char ch = strs[0].charAt(i);
            boolean q = true ;
            for(int j =0 ; j < strs.length ; j++){
                if(ch != strs[j].charAt(i)){
                  q = false ;
                }
            }
            if(q == true){
                s = s + ch;
            }
            else{
                break ;
            }
        }
        return s ;
    }
}