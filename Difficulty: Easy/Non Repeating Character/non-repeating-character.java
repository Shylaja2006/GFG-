class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> h=new HashMap<>();
        for(char ch:s.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(h.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }
}
