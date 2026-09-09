/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int i = 0 ;
        int j = mountainArr.length()-1;
        int peak = 0 ;
        while(i < j){
            int mid = i +  (j - i)/2 ;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                i = mid + 1 ;
            }
            else{
                j = mid ;
            }
        }
        peak = i ;
        i = 0 ; 
        j = peak ;
        while(i <= j){
            int mid = i + (j-i) / 2 ;
            if(mountainArr.get(mid) == target){
                return mid ;
            }
            else if(mountainArr.get(mid) > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        i = peak + 1 ;
        j = mountainArr.length()-1 ;
        while(i <= j){
            int mid = i + (j-i) / 2 ;
            if(mountainArr.get(mid) == target){
                return mid ;
            }
            else if(mountainArr.get(mid) > target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
      
        return -1 ;
    }
}