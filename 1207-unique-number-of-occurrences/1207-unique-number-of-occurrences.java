class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap <Integer,Integer> hm= new HashMap<>();
    for(int n:arr){
hm.put(n, hm.getOrDefault(n, 0) + 1);
    }
    HashSet<Integer> hs=new HashSet<>();
    for(int freq:hm.values()){
        if(hs.contains(freq)){return false;}
        hs.add(freq);
    }
    return true;
  
    }
}