class Solution {
    public void sortColors(int[] nums) {
        int a = 0 ;
        int j = nums.length - 1; 
        for(int i = 0 ; i <= j ;){
            if(nums[i] == 0){
                nums[i] = nums[a];
                nums[a] = 0 ;
                i++;
                a++;
            }
            else if(nums[i] == 2){
                nums[i] = nums[j];
                nums[j] = 2;
                j--;
            }
            else{
                i++;
            }
        }
    }
}