class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length ;
        Arrays.sort(nums);
        func(nums , target , 0 , n-1 , list , new ArrayList<>() , 0);
        return list ;
    }
    public void func(int[] nums , int target , int i , int n , List<List<Integer>> list , ArrayList<Integer> ans , int sum){
        if(sum == target){
            list.add(new ArrayList<>(ans));
            return ; 
        }
        if(i > n || sum > target){
            return ;
        }
        
        ans.add(nums[i]);
        func(nums , target , i + 1 , n , list , ans , sum +nums[i]);
        ans.remove(ans.size()-1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        func(nums , target , i +1 , n , list ,ans , sum);
        
    }
}
