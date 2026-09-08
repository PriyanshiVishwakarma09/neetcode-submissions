class Pair{
    String s ;
    int x ;
    Pair(String s , int x){
        this.s = s ;
        this.x = x ;
    }
}
class TimeMap {
    HashMap<String , ArrayList<Pair>> map = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
       if (!map.containsKey(key)) {
            return "";
        }
        String ans = "";
        ArrayList<Pair> s = map.get(key);
        int min = 0;
        int max = s.size() - 1;
        while(min <= max){
            int mid = min + (max - min) /2 ;
            if(s.get(mid).x == timestamp){
                return s.get(mid).s ;
            }
            else if(s.get(mid).x > timestamp){
                max = mid - 1;
            }
            else{
                ans = s.get(mid).s ;
                min = mid + 1 ;
            }
        }
        return ans ;
    }
}
