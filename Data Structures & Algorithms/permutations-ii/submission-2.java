class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        func(nums , list , 0);
        return list ;
    }
    public void func(int[] nums , List<List<Integer>> list , int idx){
        if(idx == nums.length){
            List<Integer> list2 = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                list2.add(nums[i]);
            }
            list.add(list2);
            return ;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = idx ; i < nums.length ; i++){
            if (set.contains(nums[i])) {
                continue;
            }

            set.add(nums[i]);
            swap(nums , i , idx);
            func(nums , list , idx+1);
            swap(nums , i , idx); 
        }
    }
    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
}