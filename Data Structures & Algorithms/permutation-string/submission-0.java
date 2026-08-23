class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length() ; 
        int n2 = s2.length();
        if(n > n2){
            return false ;
        }
     //   int j = 0 ;
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
       // arr.toString();
        for(int i = 0 ; i  <= n2 - n ; i++){
            String s = s2.substring(i , i+n);
            char[] a = s.toCharArray();
            Arrays.sort(a);
        //    a.toString();
            if(Arrays.equals(arr, a)){
                return true ; 
            }
            
        }
        return false ; 
    }
}
