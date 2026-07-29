class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0 ; i < freq.length ; i++){
            freq[i] = new ArrayList<>();
        }
        for(int x : map.keySet()){
            freq[map.get(x)].add(x);
        }
        int[] ans = new int[k];
        int index = 0 ;
        for(int i = freq.length-1 ; i >= 0 && index < k ; i--){
            for(int n : freq[i]){
                ans[index++] = n ;
                if(index == k){
                    return ans ;
                }
            }
        }
        return ans ;
    }
}
