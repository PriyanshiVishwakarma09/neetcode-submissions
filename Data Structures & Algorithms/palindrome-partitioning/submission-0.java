class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> ans=  new ArrayList<>();
        func(s , list , ans ,0 );
        return list ;
    }
    public void func(String s , List<List<String>> list , List<String> ans , int idx){
        if(idx == s.length()){

        list.add(new ArrayList<>(ans));
        return ;
        }
        for(int i = idx ; i < s.length() ; i++){
            if(isPalindrome(s , idx , i)){
                ans.add(s.substring(idx , i+1));
                System.out.println(ans);
                func(s , list , ans , i+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s , int idx , int id){
        String p = s.substring(idx , id+1);
        int i = 0;
        int j = p.length()-1;
        while(i <= j){
            if(p.charAt(i) != p.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true ;
    }
}
