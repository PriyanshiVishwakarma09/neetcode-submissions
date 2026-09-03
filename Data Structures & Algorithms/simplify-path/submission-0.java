class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] w = path.split("/");
        for(String sr : w){
            if (sr.equals("") || sr.equals(".")) {
                continue;
            }
            if (sr.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } 
            else{
                stk.push(sr);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String d : stk){
            ans.append("/").append(d);
            
        }  
        return ans.length() == 0 ? "/" : ans.toString(); 
    }
}