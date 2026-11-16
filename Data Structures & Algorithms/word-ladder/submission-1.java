class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        HashMap<String , List<String>> map = new HashMap<>();
        map.put(beginWord , new ArrayList<>());
        for(int i = 0 ;i < n ; i++){
            if(diff(beginWord , wordList.get(i))){
                map.get(beginWord).add(wordList.get(i));
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                String s1 = wordList.get(i);
                String s2 = wordList.get(j);
                if(i != j){
                    if(diff(s1 , s2)){
                        map.putIfAbsent(s1 , new ArrayList<>());
                        map.get(s1).add(s2);
                    }
                }
            }
        }
        // boolean found = false ; 
        // Queue<String> q = new LinkedList<>();
        // q.add(beginWord);
        // int count = 1 ; 
        // HashSet<String> set = new HashSet<>();
        // set.add(beginWord);
        // while(!q.isEmpty()){
        //     String s = q.poll();
        //     List<String> str = map.get(s);
        //     count++;
        //     if(str.isEmpty()){
        //         continue ; 
        //     }
        //     for(String m : str){
        //         if(!set.contains(m)){
        //         if(m.equals(endWord)){
        //             found = true ; 
        //             break ; 
        //         }
        //         if(diff(m , s)){
        //             set.add(m);
        //             q.add(m);
        //         }
        //     }
        //     }
        //     if(found){
        //         break ; 
        //     }
        // }
        // if(found){
        //     return count ; 
        // }
        // return 0;

        boolean found = false;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);

        int count = 1;

        HashSet<String> set = new HashSet<>();
        set.add(beginWord);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                String s = q.poll();

                if (s.equals(endWord)) {
                    return count;
                }

                List<String> str = map.get(s);

                if (str == null) continue;

                for (String m : str) {

                    if (!set.contains(m)) {
                        set.add(m);
                        q.add(m);
                    }
                }
            }

            count++;
        }

        return 0; 
    }
    public boolean diff(String s , String s2){
        int not = 0 ;
        if(s.length() != s2.length()){
            return false ; 
        }
        for(int i = 0 ;i < s.length() ; i++){
            if(s.charAt(i) != s2.charAt(i)){
                not++; 
            }
        }
        return not == 1 ; 
    }
}
