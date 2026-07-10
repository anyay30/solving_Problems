class Solution {
       private int tri(int r,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {

     List<List<Integer>> ans=new ArrayList<>();
     for(int r=1;r<=numRows;r++){
        List<Integer> temp=new ArrayList<>();
        for(int c=1;c<=r;c++){
            temp.add(tri(r-1,c-1));
        }
        ans.add(temp);
     }
return ans;
    }
}