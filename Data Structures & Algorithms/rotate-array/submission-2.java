class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length ; 
        k= k%n ;
        int i = 0 ;
        int j = nums.length - 1 ;
        while(i < j){
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap ;
            i++;
            j-- ;
        }
        i = 0 ;
        j = k - 1 ;
        while(i < j){
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap ;
            i++;
            j-- ;
        }
        i = k ;
        j= nums.length-1 ;
        while(i < j){
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap ;
            i++;
            j-- ;
        }
        
    }
}