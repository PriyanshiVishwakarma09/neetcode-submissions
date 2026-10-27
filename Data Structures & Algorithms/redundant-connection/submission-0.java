class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length ;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ;i <= n ; i++){
            list.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            list.get(u).add(v);
            list.get(v).add(u);
            boolean[] visit = new boolean[n + 1];
            if(dfs(u , -1 , visit , list)){
                return e ;
            }
        }
        return new int[0];
    }
    public boolean dfs(int node , int parent , boolean[] visit , List<List<Integer>> list){
        if(visit[node]){
            return true ;
        }
        visit[node] = true ;
        for(int x : list.get(node)){
            if(x == parent){
                continue;
            }
            if(dfs(x , node , visit , list)){
                return true ;
            }
        }
        return false ;
    }
}
