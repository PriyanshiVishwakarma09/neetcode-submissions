class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sk = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){
            if(!sk.isEmpty() && tokens[i].equals("+")){
                int x = sk.pop();
                int p = sk.pop();
                sk.push(x+p);
            }
            else if(!sk.isEmpty() && tokens[i].equals("-")){
                int x = sk.pop();
                int p = sk.pop();
                sk.push(p-x);
            }
            else if(!sk.isEmpty() && tokens[i].equals("*")){
                int x = sk.pop();
                int p = sk.pop();
                sk.push(x*p);
            }
            else if(!sk.isEmpty() && tokens[i].equals("/")){
                int x = sk.pop();
                int p = sk.pop();
                sk.push(p/x);
            }
            else{

                sk.push(Integer.parseInt(tokens[i]));
            }
        }
        return sk.pop();

    }
}
