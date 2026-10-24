class Solution {
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    int[] ans ;
    int p = 0 ;
    HashSet<Integer> set2 = new HashSet<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ans =  new int[numCourses]; 
        for(int i = 0 ; i< numCourses ; i++){
            map.put(i , new ArrayList<>());
        } 
        for(int[] x : prerequisites){
            map.get(x[0]).add(x[1]);
        }
        for(int i = 0 ; i < numCourses ; i++){
            if(!dfs(i)){
                int[] l = new int[0];
                return l;
            }
        }
        for(int i = 0 ; i < numCourses ; i++){
            if(!set2.contains(i)){
                ans[p++] = i ;
            }
        }
        return ans ;
    }
    public boolean dfs(int i){
        if(set.contains(i)){
            return false ;
        }
        if(map.get(i).isEmpty()){
            return true ;
        }
        set.add(i);
        for(int x : map.get(i)){
            if(!dfs(x)){
                return false;
            }
            if(!set2.contains(x)){
                ans[p++] = x ;
            }
            set2.add(x);
        }
        set.remove(i);
        map.put(i , new ArrayList<>());
        return true ;
    }
}
