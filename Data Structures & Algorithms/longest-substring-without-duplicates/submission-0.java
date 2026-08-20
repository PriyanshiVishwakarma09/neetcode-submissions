class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int i = 0 ; 
        int j = 0 ;
        int max = 0;
        while(i < s.length()){
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
            if(map.containsKey(s.charAt(i))){
                while(map.get(s.charAt(i)) > 1){
                    map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) - 1);
                    j++;
                }
            }
                max = Math.max(max , i-j + 1);
                i++;
        }
        return max ; 
    }
}
