class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> h=new HashMap<>();
        for(char ch:s1.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            if(!h.containsKey(ch)){
                return false;
            }
            h.put(ch,h.get(ch)-1);
            if(h.get(ch)==0){
                h.remove(ch);
            }
        }
        return h.isEmpty();
    }
}