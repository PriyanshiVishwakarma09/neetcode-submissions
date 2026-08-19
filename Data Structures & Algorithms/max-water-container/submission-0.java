class Solution {
    public int maxArea(int[] heights) {
       int i = 0 ;
       int j = heights.length-1 ;
       int max = 0 ;
       while(i < j){
            int p = Math.min(heights[i] , heights[j]);
            int sum = p * (j-i);
            max = Math.max(max , sum);
            if(heights[j] > heights[i]){
                i++;
            }
            else{
                j--;
            }
       }
       return max ; 
    }
}
