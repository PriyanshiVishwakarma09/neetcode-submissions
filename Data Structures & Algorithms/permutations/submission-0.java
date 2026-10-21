class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        func(list , 0 , nums);
        return list ; 
    }
    public void func(List<List<Integer>> list , int idx , int[] nums){
        if(idx == nums.length){
            List<Integer> ans = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                ans.add(nums[i]);
            }
            list.add(ans);
        }
        for(int i = idx ; i < nums.length ; i++){
            swap(idx , i , nums);
            func(list , idx + 1 , nums);
            swap(idx , i , nums);
        }
    }
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
}
