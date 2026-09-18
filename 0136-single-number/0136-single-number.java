class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> hs=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
      }  
      //  Find the number that appears only once
        for (int key : hs.keySet()) {
            if (hs.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}