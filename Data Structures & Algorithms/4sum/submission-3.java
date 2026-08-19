class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-3 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue ; 
            }
            for(int j = i+1 ; j < nums.length-2 ; j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue ; 
                }
                int p = j+1;
                int q = nums.length-1 ;
                while(p < q){
                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q]  ;
                    if(sum == target){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[p]);
                        ans.add(nums[q]);
                        list.add(ans);
                        p++;
                        q--;
                        while(p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }
                        while(p < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    }
                    else if(sum > target){
                        q--;
                    }
                    else{
                        p++;
                    }
                }
            }
        }
        return list ;
    }
}