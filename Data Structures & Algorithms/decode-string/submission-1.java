class Solution {
    public String decodeString(String s) {
        Stack<String> sk = new Stack<>();
        for(int i=0 ; i < s.length() ; i++){
        if (Character.isDigit(s.charAt(i))) {
            StringBuilder num = new StringBuilder();

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num.append(s.charAt(i));
                i++;
            }

            sk.push(num.toString());

            i--;
        }
        else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder();
                while(!sk.peek().equals("[")){
                    sb.insert(0, sk.pop());
                }
                sk.pop();

                int x = Integer.parseInt(sk.pop());
                StringBuilder sbr = new StringBuilder();
                while(x != 0){
                    sbr.append(sb.toString());
                    x-- ;
                }
                sk.push(sbr.toString());
        }
            else{
                String x  = String.valueOf(s.charAt(i));
                sk.push(x);
            }
        }
        StringBuilder ss = new StringBuilder();
        for(String p : sk){
            ss.append(p);
        }
        return ss.toString() ;
    }
}