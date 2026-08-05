class Solution {
    int dp[][];
    public boolean solve(int nums[],int x,int i){
    if(x==0)return true;
    if(i>=nums.length)return false;
    if(dp[i][x]!=-1)return dp[i][x]==1;
    boolean take=false;
    if(nums[i]<=x){
        take=solve(nums,x-nums[i],i+1);
    }
    boolean not_take=solve(nums,x,i+1);
   boolean ans= take || not_take;
  
        dp[i][x] = ans ? 1 : 0;

        return ans;
    }
    public boolean canPartition(int[] nums) {
    int s=0;
    for(int i=0;i<nums.length;i++){
        s+=nums[i];
    }
    if(s%2!=0)return false;
    int x=s/2;
     dp = new int[nums.length][x + 1];

    for(int i=0;i<nums.length;i++){
        Arrays.fill(dp[i],-1);
    }
    return solve(nums,x,0);

    }
}