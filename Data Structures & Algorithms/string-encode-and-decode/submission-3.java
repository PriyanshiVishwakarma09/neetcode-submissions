class Solution {
    public String encode(List<String> strs) {
        String s = "";
        for(int i = 0;  i < strs.size() ; i++){
            s = s + strs.get(i).length() + "#"; 
            s = s + strs.get(i);
        }
        return s ;
    }
    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
       // int count = (int)(str.charAt(0));
        int i = 0 ; 
        while(i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
             int count = Integer.parseInt(str.substring(i, j));
            j++;
            String p = str.substring(j, j + count);
            ans.add(p);
            i = j + count;
        }
        return ans ; 
    }
}
