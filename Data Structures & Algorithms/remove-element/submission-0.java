class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0 ;
        int j = 0 ;
        int n = nums.length ; 
        while(j < n){
            if(nums[j] == val){
                j++;
          //      i++;
            }
            else{
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        return i ; 
    }
}