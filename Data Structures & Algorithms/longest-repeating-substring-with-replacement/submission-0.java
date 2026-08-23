class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0 ;
        int j = 0 ;
        int ans = 0 ;
        while(i < s.length()){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
            int max = 0 ;
            for(char x : map.keySet()){
                max = Math.max(map.get(x) , max);
            }
            if(i-j+1 - max <= k){
                ans = Math.max(ans , i-j+1);
            }
            else{
                while(i-j+1 - max >k){
                    map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) - 1);
                      for(char x : map.keySet()){
                    max = Math.max(map.get(x) , max);
                }
                j++;
            }
            }
            i++;
        }
        return ans ; 

    }
}
