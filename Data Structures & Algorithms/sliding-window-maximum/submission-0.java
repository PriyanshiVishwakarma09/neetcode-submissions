class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0 ;
        while(i < k){
            p.add(nums[i]);
            i++;
        }
        int[] ans = new int[nums.length-k+1];
        int m = 0 ;
        ans[m++] = p.peek();
        int l = 0 ;
        for(int j = 1 ; j <= nums.length - k ; j++){
            p.add(nums[j+k-1]);
            p.remove(nums[l]);
            l++;
            ans[m++] = p.peek();
        }
        return ans ; 
    }
}
