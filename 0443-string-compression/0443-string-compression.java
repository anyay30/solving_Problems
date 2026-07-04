class Solution {
    public int compress(char[] chars) {
    int n=chars.length;
       int w=0;
       int i=0;
       while(i<n){
       char cur=chars[i];
       int c=0;
       while(i<n && cur==chars[i]){
        c++;
        i++;
       }
       chars[w]=cur;
       w++;

       if(c>1){
       String freq= Integer.toString(c);
       for(char ch:freq.toCharArray()){
        chars[w++]=ch;
       }
       }
       } 
       return w;
    }
}