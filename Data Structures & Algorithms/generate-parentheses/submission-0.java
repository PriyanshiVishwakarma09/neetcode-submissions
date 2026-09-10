class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        func(n , 0 , 0 , str , sb);
        return str;
    }
    public void func(int n , int i , int j , List<String> str , StringBuilder sb){
        if(i == n && j == n){
            str.add(sb.toString());
            return ;
        }
        if(i < n && i >= j){
            sb.append("(");
            func(n , i +1 , j , str , sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(j < i){
            sb.append(")");
            func(n , i , j+1 , str , sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
