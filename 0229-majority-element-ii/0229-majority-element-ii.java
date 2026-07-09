class Solution {
    public List<Integer> majorityElement(int[] nums) {

     int c1=1;
     int maj1=nums[0];
 
     int c2=0;
     int maj2=nums[0];

     for(int i=1;i<nums.length;i++){
        
     if(nums[i]==maj1){c1++;}
     else if(nums[i]==maj2){c2++;}
     else if(c1==0){
            maj1=nums[i];c1++;}
     else if(c2==0){
            maj2=nums[i];c2++;}
     else{c1--; c2--;}
     
}
List <Integer> res=new ArrayList <>();
int f1=0;
int f2=0;
 
 for(int n:nums){
    if(n==maj1){f1++;}
    else if(n==maj2){f2++;}
 }
 if(f1>(nums.length/3)){
    res.add(maj1);
 }
 if(f2>(nums.length/3)){
    res.add(maj2);
 }
 return res;
    }
}
