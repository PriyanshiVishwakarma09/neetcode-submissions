class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      //  long min = Integer.MAX_VALUE ;
        long max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < piles.length ; i++){
     //   min = Math.min(min , piles[i]);
        max = Math.max(max , piles[i]);
        }
        long min = 1;
        long ans = max;
        while(min <= max){
             long mid = min + (max - min) /2 ;
             if(func(mid , piles) > h){
                min = mid + 1 ;
             }
             else{
                ans = mid ;
                max = mid -1;
             }
        }
        return (int)ans ; 
    }
    public long func(long mid , int[] piles){
        long count =0  ;
        for(int i = 0 ; i < piles.length ; i++){
            if(piles[i] <= mid){
                count++;
            } 
            else{
                if(piles[i]%mid == 0){
                count += piles[i]/mid ;
                }
                else{
                count += piles[i]/mid + 1 ; 
                }
            }
        }
        return count ;
    }

}
