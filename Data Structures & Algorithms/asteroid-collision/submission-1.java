class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sk = new Stack<>();
        for(int i = 0 ; i < asteroids.length ; i++){
            boolean collision = false;
            int q = asteroids[i];
            while(!sk.isEmpty() && sk.peek() >= 0 && q < 0){
                int p = sk.peek();
                if(p > -q){
                    collision = true ;
                    break ;
                }
                else if(p == -q){
                    sk.pop();
                    collision = true ;
                    break ; 
                }
                else{
                    sk.pop();
                   // sk.push(q);
                }
            }
            if(collision == false){
                sk.push(q);
            }
        }
        int[] ans = new int[sk.size()];
        int j = sk.size()-1;
        while(!sk.isEmpty()){
            ans[j--] = sk.pop();
        }
        return ans ;
    }
}