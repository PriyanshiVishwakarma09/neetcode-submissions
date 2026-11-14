class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            int h = 0 ;
            // Queue<Integer> q = new LinkedList<>();
            // q.add(i);
            boolean[] visited = new boolean[n];
           // visited[i] = true ;
            // while(!q.isEmpty()){
            //     int x = q.poll();

            //     int size = list.get(x).size();
            //     for(int j = 0 ;j < size ; j++){
            //         if(!visited[list.get(x).get(j)]){
            //             visited[list.get(x).get(j)] = true ;
            //             q.add(list.get(x).get(j));
            //         }
            //     }
            // }
            // arr[i] = h ;
        
            arr[i] =  dfs(visited , list , h , i);

        }
        // for(int i = 0; i < n ; i++){
        //     System.out.println(arr[i]);
        // }
        int min = Integer.MAX_VALUE ;
        for(int i = 0; i < n ; i++){
            min = Math.min(min , arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == min){
                ans.add(i);
            }
        }
        return ans ;
    }
    public int dfs(boolean[] visited , List<List<Integer>> list , int h , int i){
        if(visited[i]){
            return h-1 ;
        }
        int max = h ;
        visited[i] = true ;
        for(int x : list.get(i)){
           if (!visited[x]) { 
                max = Math.max(max, dfs(visited, list, h + 1, x)
            );
            }
        }
        return max ; 
    }
}