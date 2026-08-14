class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ; 
        int i = 0 ;
        while(i < n){
            if(nums[i] > 0 && nums[i] <= n){
                int curridx = nums[i]-1 ;
                if(nums[i] != nums[curridx]){
                    int temp = nums[i];
                    nums[i] = nums[curridx];
                    nums[curridx] = temp ;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for(int p = 0 ; p < n ; p++){
            if(nums[p] != p+1){
                return p+1 ; 
            }
        }
        return n+1;
    }
}