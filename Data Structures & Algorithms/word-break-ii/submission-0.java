class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0 ; i < wordDict.size() ; i++){
            map.put(wordDict.get(i) , 0);
        }
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        func(ans , map , s , 0 , sb);
        for(String p : ans){
            p.trim();
        }
        return ans ;
    }
    public void func(List<String> ans , HashMap<String , Integer> map , String s , int i , StringBuilder sb){
        if(i == s.length()){
            ans.add(sb.toString());
            return ;
        }
        for(int j = i+1 ; j <= s.length() ; j++){
            String p = s.substring(i , j);
            if(map.containsKey(p)){
               int len = sb.length();
                if (len > 0) {
                    sb.append(" ");
                }
                    sb.append(p);
               //     map.put(p , 1);
                    func(ans , map, s , j, sb);
             //       map.put(p , 0);
                    sb.setLength(len);
                }
            
        }
    }
}