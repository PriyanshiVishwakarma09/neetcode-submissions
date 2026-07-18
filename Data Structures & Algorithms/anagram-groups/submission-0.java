class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , List<String>> map= new HashMap<>();
        for(int i= 0 ;  i < strs.length ; i++){
            String p = strs[i];
            char[] ch = p.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch); 
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(p);
        }
        for(String x : map.keySet()){
            List<String> q = new ArrayList<>();
            for(String p : map.get(x)){
                q.add(p);
            }
            ans.add(q);
        }
        return ans ;
    }
}
