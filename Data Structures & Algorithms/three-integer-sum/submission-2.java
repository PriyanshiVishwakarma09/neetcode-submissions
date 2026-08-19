class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int p = i+1 ;
            int q = nums.length-1 ;
            while(p < q){
                if(nums[p] + nums[q] + nums[i] == 0){
                   List a = new ArrayList<>();
                   a.add(nums[p]);
                   a.add(nums[q]);
                   a.add(nums[i]);
                   ans.add(a);
                   p++;
                   q--; 

                    while(p < q && nums[p] == nums[p - 1]) {
                        p++;
                    }

                    while(p < q && nums[q] == nums[q + 1]) {
                        q--;
                    }
                }
                else if(nums[p] + nums[q] + nums[i] > 0){
                    q--;
                }
                else{
                    p++;
                }
            }
        }
        return ans ; 
    }
}
