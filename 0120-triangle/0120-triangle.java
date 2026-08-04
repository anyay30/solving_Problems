class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
       int  n=triangle.size();
        List<List<Integer>>t= triangle;
        for(int r=n-2;r>=0;r--){
            for(int c=0;c<=r;c++){
                  int value = triangle.get(r).get(c)
                        + Math.min(
                            triangle.get(r + 1).get(c),
                            triangle.get(r + 1).get(c + 1)
                        );
                        triangle.get(r).set(c, value);
            }
        }
        return triangle.get(0).get(0);
    }
}