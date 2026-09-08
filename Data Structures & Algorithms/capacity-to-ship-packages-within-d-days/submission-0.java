class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < weights.length ; i++){
            min = Math.max(min , weights[i]);
            max += weights[i];
        }
        int ans = 0 ;
        while(min <= max){
            int mid = min + (max - min) /2 ;
            if(func(mid , days , weights) > days){
                min = mid + 1;
            }
            else{
                ans = mid;
                max = mid - 1;
            }
        }
        return ans ;
    }
    public int func(int mid , int days , int[] weights){
        int count = 1 ;
        int sum = 0 ;
        for(int i = 0 ; i < weights.length ; i++){
            if(sum + weights[i] > mid){
                count++ ;
                sum = 0 ;
                sum += weights[i];
            }
            else{
                sum += weights[i];
            }
        }
        

        return count ;
    }
}