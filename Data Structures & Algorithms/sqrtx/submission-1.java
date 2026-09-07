class Solution {
    public int mySqrt(int x) {
        int i = 1 ; 
        int p = x ; 
        int ans = 0 ;
        while(i <= x){
            int mid = i + (x - i) / 2 ;
            if(mid > p/mid){
                x = mid -1;
            }
            else{
                ans = mid ; 
                i = mid+1;
            }
        }
        return ans;
    }
}