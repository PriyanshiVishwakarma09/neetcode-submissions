
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length ; 
        int q = matrix[0].length ; 
        for(int i = 0 ; i < n ; i++){
            int j = 0 ;
            int l = q-1 ;
            while(j <= l){
                int mid = j + (l-j)/2 ;
                if(matrix[i][mid] == target){
                    return true ;
                }
                else if(matrix[i][mid] > target){
                    l = mid - 1 ;
                }
                else{
                    j = mid + 1 ;
                }
            }

    }
        return false ;
}
}
