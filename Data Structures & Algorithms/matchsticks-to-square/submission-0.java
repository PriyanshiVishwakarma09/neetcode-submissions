class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0 ;
        for(int i = 0 ; i < matchsticks.length ; i++){
            sum += matchsticks[i];
        }
        int n = matchsticks.length ; 
        if(n < 4){
            return false ;
        }
        int x = 0 ;
        if(sum%4 != 0){
            return false ;
        }
        x = sum/4;
        boolean[] arr = new boolean[matchsticks.length];
        return func(0 , matchsticks , x , 0,arr , 0 , 4);
    }
    public boolean func(int idx , int[] matchsticks , int target , int sum , boolean[] arr, int count , int k){
        if(count == k-1){
            return true;
        }
        if(sum == target){
            return func(0, matchsticks , target , 0, arr , count+1 , k);
        }
        for(int i = idx ; i < matchsticks.length ; i++){
            if(arr[i]){
                continue ;
            }
            arr[i] = true ;
            if(func(i + 1 , matchsticks , target , sum + matchsticks[i] , arr , count , k)){
                return true ;
            }
            arr[i] = false;
        }
        return false ;
    }
}