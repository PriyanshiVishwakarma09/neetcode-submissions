class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums , 0 , nums.length);
        return nums;
    }
    public void mergesort(int[] nums , int start , int end){
          if (end - start <= 1) return;

            int mid = start + (end-start) / 2 ;
            mergesort(nums , start , mid);
            mergesort(nums , mid , end);
            merge(nums , start , mid , end);
    }
    public void merge(int[] nums , int start , int mid , int end){
        int[] arr = new int[end-start];
        int i= start ; 
        int j = mid ;
        int p = 0 ;
        while(i < mid && j < end){
            if(nums[i] <= nums[j]){
                arr[p++] = nums[i];
                i++;
            }
            else{
                arr[p++] = nums[j];
                j++;
            }
        }
        if(i < mid){
        while(i < mid){
            arr[p++] = nums[i];
            i++;
        }
        }
        if(j < end){
        while(j < end){
            arr[p++] = nums[j];
            j++;
        }
        }
        for(int q = 0; q < arr.length ; q++){
            nums[q+start] = arr[q];
        }
    }
}