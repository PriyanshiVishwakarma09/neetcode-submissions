class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length ;
        if(n == 1){
            return 1 ; 
        }
        double[][] a = new double[n][2];
        for(int i = 0 ; i < n ; i++){
            double p = target - position[i];
            double t = p / speed[i];
            a[i][0] = position[i];
            a[i][1] = t ;
        }
        Arrays.sort(a, (a1, b1) -> Double.compare(b1[0], a1[0]));
        int ans = 0 ;
        double prev = 0 ;
        for(double[] x : a){
            if(x[1] > prev){
                ans++;
                prev = x[1];
            }
        }
        return ans ;

    }
}
