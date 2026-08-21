class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length ;
        if(n <= 1){
            return false ;
        }
        for(int i = 0 ; i <= k ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            if(map.get(nums[i]) > 1){
                return true;
            }
        }
        int j = 0 ;
        for(int i = k+1 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
          //  if(map.get(nums[i-k-1]) > 1){
                map.put(nums[i-k-1] , map.getOrDefault(nums[i-k-1] , 0) -1);
                //j++;
           // }
            if(map.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
        
        
    }
}