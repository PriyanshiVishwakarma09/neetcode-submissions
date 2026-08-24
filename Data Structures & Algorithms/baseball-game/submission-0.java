class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("+")){
                if(stack.size() >= 2){
                    int a = stack.get(stack.size()-1);
                    int b = stack.get(stack.size()-2);
                    int c = a + b ;
                    stack.push(c);
                }
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int p = stack.peek()*2 ;
                stack.push(p);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));

            }
        }
        int ans =0 ;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans ;
    }
}