class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return func(n , dp);
    }
    public int func(int n , int[] dp){
        if(n == 0){
            return 1 ;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int two = 0 ;
        if(n - 2 >= 0 ){
        two = func(n-2 , dp);
        }
        int one = func(n-1 , dp);
        return dp[n]= two + one ;
    }
}
