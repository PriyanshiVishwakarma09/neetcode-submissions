class Solution {
    HashMap<Integer , ArrayList<Integer>> map  = new HashMap<>();
    boolean[] visited ;
    public int countComponents(int n, int[][] edges) {
        visited = new boolean[n];
        for(int i = 0; i < n ; i++){
            map.put(i , new ArrayList<>());
        }
        for(int[] x : edges){
            int x1 = x[0];
            int x2 = x[1];
            map.get(x1).add(x2);
            map.get(x2).add(x1);
        }
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                func(i);
                count++;
            }
        }
        return count ;
    }
    public void func(int x){
        if(visited[x]){
            return ;
        }
        // if(map.get(x).isEmpty()){
        //     return ;
        // }
        visited[x] = true ;
        for(int x1 : map.get(x)){
            func(x1);
        }
    }
}
