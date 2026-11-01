class Solution {
    public char findTheDifference(String s, String t) {
        char x=0;
  for(char c:s.toCharArray()) {x^=c;}
  for(char d:t.toCharArray()) {x^=d;}
    return x;
    }
}