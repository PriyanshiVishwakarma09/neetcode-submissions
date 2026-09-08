class Solution {
    public int splitArray(int[] arr, int k) {
        int min = 0 ;
            int max = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                min = Math.max(min , arr[i]);
                max += arr[i];
            }
            while(min <= max){
                int mid = min + (max - min) / 2 ;
                if(func(mid , arr ) <= k){
                    max = mid - 1;
                }
                else{
                    min = mid + 1;
                }
            }

            return min;
        }
        public int func(int mid , int[] arr){
            int count = 1 ;
            int sum = 0 ;
            for(int i =0 ; i < arr.length ; i++){
                if(sum + arr[i] > mid){
                    count++;
                    sum = 0 ;
                    sum += arr[i];
                }
                else{
                    sum += arr[i];
                }
            }
            return count ;
        }
    
}