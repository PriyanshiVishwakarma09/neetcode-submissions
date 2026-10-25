class Solution {
    HashSet<Integer> set = new HashSet<>();
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
    public boolean validTree(int n, int[][] edges) {
        for(int i = 0 ; i < n ; i++){
            map.put(i , new ArrayList<>());
        }
        for(int[] x : edges){
                map.get(x[0]).add(x[1]);
                map.get(x[1]).add(x[0]);
        }
        // for(int i = 0 ; i < n ; i++){
            if(!dfs(0, -1)){
                return false ;
            }
       // }
        return set.size() == n;
    }
    public boolean dfs(int i , int parent){
        if(set.contains(i)){
            return false;
        }
        set.add(i);
        for(int x : map.get(i)){
            if (x == parent) {
                continue;
            }
            if (!dfs(x, i)) {
                return false;
            }
        }
        return true ;
    }
}
