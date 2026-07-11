class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;

            int left=i+1, rig=nums.length-1;
            while(left<rig){
                int s=nums[i]+nums[left]+nums[rig];

                if(s==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[rig]));
                    left++;
                    rig--;

                    while(left<rig && nums[left]==nums[left-1])left++;
                    while(left<rig && nums[rig]== nums[rig+1])rig--;
                }
                else if(s<0)left++;
                else rig--;
            }
        }
        return ans;
    }
}