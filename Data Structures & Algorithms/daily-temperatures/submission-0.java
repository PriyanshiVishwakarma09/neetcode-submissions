class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length ; 
        int[] ans = new int[n];
       // Arrays.fill(ans , 0);
        Stack<Integer> stk = new Stack<>();
        stk.push(n-1);
        ans[n-1] = 0 ;
        for(int i = n-2 ; i >= 0 ; i--){
            while(!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ans[i] = stk.peek()-i ;
            }
            else{
                ans[i] = 0 ;
            }
            stk.push(i);
        }
        return ans ;
    }
}
