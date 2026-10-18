class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] ans = new int[arr.length];
        for(int i = 0 ;i < ans.length ; i++){
            ans[i] = arr[i] - x ;
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = ans.length-1;
        while(j-i >= k){
            if(Math.abs(ans[j]) >= Math.abs(ans[i])){
                j--;
            }
            else{
                i++;
            }
        }
        for(int p=i;p<= j ;p++){
            list.add(arr[p]);
        }
        return list;
    }
}