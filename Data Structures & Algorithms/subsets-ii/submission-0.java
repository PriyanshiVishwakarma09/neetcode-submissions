class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length ; 
        Arrays.sort(nums);
        func(nums , n , 0 , list , new ArrayList<>());
        return list ;
    }
    public void func(int[] nums , int n , int i , List<List<Integer>> list , ArrayList<Integer> list2){
        if(n == i){
            list.add(new ArrayList<>(list2));
            return ;
        }
        list2.add(nums[i]);
        func(nums , n , i+1 , list , list2);
        list2.remove(list2.size()-1);
        while(i < n - 1 && nums[i] == nums[i+1]){
            i++;
        }
        func(nums , n , i+1 , list , list2);


    }
}
