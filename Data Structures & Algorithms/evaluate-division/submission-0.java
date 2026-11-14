class Pair {
    String node;
    double weight;

    Pair(String node, double weight) {
        this.node = node;
        this.weight = weight;
    }
}
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        for(int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];
            map.computeIfAbsent(u, k -> new HashMap<>()).put(v, val);
            map.computeIfAbsent(v, k -> new HashMap<>()).put(u, 1.0 / val);
        }
        int n = queries.size();
        double[] ans = new double[n];
        Arrays.fill(ans , -1);
        for(int i = 0 ; i < n ; i++){
            //int x = 0 ;
            String s = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            if(!map.containsKey(s) || !map.containsKey(d)){
                continue;
            }
            Queue<Pair> q = new LinkedList<>();
            HashSet<String> visited = new HashSet<>();
            visited.add(s);
            q.add(new Pair(s , 1.0));
            boolean found = false ;
            while(!q.isEmpty()){
                Pair p = q.poll() ;
                String h = p.node; 
                if(h.equals(d)){
                    ans[i] = p.weight ;
                    found = true ;
                    break ; 
                }
                HashMap<String , Double> m = map.get(h);
                int size = m.size();
                for(String j : m.keySet()){
                    if(!visited.contains(j)){
                        visited.add(j);
                        q.add(new Pair(j, m.get(j) * p.weight));
                    }
                }
            }
        }
        return ans ;
    }
}