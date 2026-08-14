class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int n = nums.length ; 
        for(int i = 0 ; i < n ; i++){
            map.add(nums[i]);
        } 
        int small = Integer.MAX_VALUE ; 
        int large = Integer.MIN_VALUE ;
        for(int x : map){
            if(x < small && x >= 0){
                small = x;
            }
            if(x > large && x >= 0){
                large = x;
            }
        }
       if(small > 1){
        return 1 ; 
       }
        int p = small ;
        for(int i : map){
            if(map.contains(p+1)){
               p++;
            }
            else{
                return p+1 ;
            }
        }
        return large + 1 ; 
    }
}