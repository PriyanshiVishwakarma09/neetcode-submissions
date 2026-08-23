class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        int n = s.length();
        int n2 = t.length();
        if(n < n2){
            return ans ; 
        }
        int min = Integer.MAX_VALUE ;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) + 1);
        }
        HashMap<Character , Integer> map2 = new HashMap<>();
        int i = 0 ;
        int j =  0 ;
        int start = 0; 
        int end = 0 ;
        while(i < s.length()){
            map2.put(s.charAt(i) , map2.getOrDefault(s.charAt(i) , 0) + 1);
            if(isContain(map , map2)){
                while(isContain(map , map2)){
                    if(min > i-j+1){
                        min = i-j+1 ;
                        start = j ;
                        end = i+1 ;
                    }  
                    map2.put(s.charAt(j) , map2.getOrDefault(s.charAt(j) , 0)-1);
                    j++;
                }
            }
            i++;
        }

        return s.substring(start , end);
    }
    public static boolean isContain(HashMap<Character , Integer> map , HashMap<Character , Integer> map2){
        for(char x : map.keySet()){
            if(!map2.containsKey(x)){
                return false ;
            }
            else{
                if(map2.get(x) < map.get(x)){
                    return false ;
                }
            }
        }
        return true ;
    }
}
