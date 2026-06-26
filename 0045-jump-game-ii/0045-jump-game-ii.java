class Solution {
    public int jump(int[] nums) {
        int n=nums.length-1;
        int jumps=0;
        int l=0,far=0;
            for(int i=0;i<n;i++){
              far=Math.max(nums[i]+i,far);
              if(i==l){
            jumps++;
            l=far;
              }
            }
        return jumps;
    }
}