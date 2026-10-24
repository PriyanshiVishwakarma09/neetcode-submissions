class Solution {
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i =0 ;i < numCourses ; i++){
            map.put(i , new ArrayList<>());
        }
        for(int[] x : prerequisites){
            map.get(x[0]).add(x[1]);
        }
        for(int i = 0 ; i < numCourses ; i++){
            if(!dfs(i)){
                return false; 
            }
        }
        return true ;
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
                return false ;
            }
        }
        set.remove(i);
        map.put(i , new ArrayList<>());
        return true ;
    }
}
