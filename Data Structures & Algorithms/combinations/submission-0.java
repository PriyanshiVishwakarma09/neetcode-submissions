class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        func(k , 1 , n , list , new ArrayList<>());
        return list ;
    }
    public void func(int index , int i , int n , List<List<Integer>> list , ArrayList<Integer> ans ){
        if(ans.size() == index){
            list.add(new ArrayList<>(ans));
            return ; 
        }
        if(i > n){
            return ;
        }
        ans.add(i);
        func(index , i + 1 , n , list , ans);
        ans.remove(ans.size()-1);
        func(index , i + 1 , n , list , ans);   
    }
}
