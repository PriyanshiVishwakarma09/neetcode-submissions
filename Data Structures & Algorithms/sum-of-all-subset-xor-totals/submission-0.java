class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0 ;
        int n = nums.length ;
        ArrayList<Integer> list = new ArrayList<>();
        return subset(list , nums , sum , n ,0);

    }
    public int subset(ArrayList<Integer> list , int[] nums , int sum , int n , int i){
        if(n == i){
            int p = 0;
            for(int j = 0 ; j < list.size() ; j++){
                p ^= list.get(j);
            }
            
            return p;
        }
       
        list.add(nums[i]);
        int pick = subset(list , nums , sum , n , i+1);
        list.remove(list.size()-1);
        int notpick = subset(list , nums , sum , n , i+1);
        return pick + notpick;
    }
}