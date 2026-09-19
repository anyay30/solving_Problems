class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> hs=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     hs.put(nums[i],hs.getOrDefault(i,0)+1);
        // }
        // if(hs.containsValue(2)) return true;
        // else return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}