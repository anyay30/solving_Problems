class Solution {
       int dp[];
    public int climbStairs(int n) {
        dp=new int [n+1];
        Arrays.fill(dp, -1);
        return fooh(n);}

        public int fooh(int n){
        if(n<0){return 0;}
        if(dp[n]!=-1){return dp[n];}
        if(n==0){return 1;}
   dp[n] = fooh(n - 1) + fooh(n - 2);
   return dp[n];
         }
    
}
//recursion