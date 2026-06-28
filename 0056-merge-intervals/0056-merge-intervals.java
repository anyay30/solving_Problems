class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n){
            int s=intervals[i][0];
            int f=intervals[i][1];
            int j=i+1;
            while(j<n&&intervals[j][0]<=f){
                f=Math.max(f,intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(s,f));
            i=j;
        }
         int[][] res = new int[ans.size()][2];
        for (int k = 0; k < ans.size(); k++) {
            res[k][0] = ans.get(k).get(0);
            res[k][1] = ans.get(k).get(1);
        }
        return res;
    }
}