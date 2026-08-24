class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')'){
            return false ;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'){
                if(!stk.isEmpty() && stk.peek() == '[' && s.charAt(i) == ']'){
                    stk.pop();
                }
                else if(!stk.isEmpty() && stk.peek() == '{' && s.charAt(i) == '}'){
                    stk.pop();
                }
                else if(!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')'){
                    stk.pop();
                }
                else{
                    return false ;
                }
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        return !stk.isEmpty() ? false : true ;
    }
}
