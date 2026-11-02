class Solution {
    class UnionFind{
    int[] parent ;
    int[] rank ; 
    public UnionFind(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i = 0 ; i < n ; i++){
            parent[i] = i ; 
            rank[i] = 0 ;
        }
    }
    public int find(int x){
        if(x != parent[x]){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public boolean union(int p , int q){
        int p1= find(p);
        int p2 = find(q);
        if(p1 == p2){
            return false ;
        }
        if(rank[p1] > rank[p2]){
            parent[p2] = p1 ;
            rank[p2] += rank[p1];
        }
        else{
            parent[p1] = p2 ;
            rank[p2] += rank[p1];
        }
        return true ;
    }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        UnionFind u = new UnionFind(n);
        Map<String , Integer> map = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            List<String> list = accounts.get(i);
            for(int j = 1 ; j < list.size() ; j++){
                String email = list.get(j);
                if(map.containsKey(email)){
                    u.union(i , map.get(email));
                }
                else{
                    map.put(email , i);
                }
            }
        }

        HashMap<Integer , List<String>> emailGroup = new HashMap<>();
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            String email = entry.getKey();
            int accId = entry.getValue();
            int leader = u.find(accId);
            emailGroup.putIfAbsent(leader, new ArrayList<>());
            emailGroup.get(leader).add(email);
        }

         List<List<String>> res = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : emailGroup.entrySet()) {
            int accId = entry.getKey();
            List<String> emails = entry.getValue();
            Collections.sort(emails);
            List<String> merged = new ArrayList<>();
            merged.add(accounts.get(accId).get(0));
            merged.addAll(emails);
            res.add(merged);
        }

        return res;
    }
}