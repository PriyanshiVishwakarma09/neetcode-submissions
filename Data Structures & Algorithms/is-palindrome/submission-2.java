class Solution {
    public boolean isPalindrome(String s) {
        String p = "";
        for(int i = 0 ; i< s.length() ; i++){
            if( Character.isLetterOrDigit(s.charAt(i))){
                p = p + s.charAt(i);
            }
        }
        String k = p.toLowerCase();
        int i = 0 ;
        int j = k.length()-1;
        while(i < j){
            if(k.charAt(i) != k.charAt(j)){
                return false ;
            }
            i++;
            j--;
        }
        return true ; 
    }
}
