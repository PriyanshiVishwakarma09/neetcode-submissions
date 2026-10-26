class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] ans = new boolean[numCourses][numCourses];
        for(int i = 0 ; i < prerequisites.length ; i++){
            int s = prerequisites[i][0];
            int d = prerequisites[i][1];
            ans[s][d] = true ;
        }
        for(int k = 0 ; k< numCourses ; k++){
            for(int s =0; s < numCourses ; s++){
                for(int d = 0 ; d < numCourses ; d++){
                    ans[s][d] = ans[s][d] || (ans[s][k] && ans[k][d]);
                }
            }
        }
        List<Boolean> a = new ArrayList<>();
        for(int i = 0; i < queries.length ; i++){
            int m = queries[i][0];
            int n = queries[i][1];
            a.add(ans[m][n]);
        }
        return a ;
        
    }
}