class Solution {
    String removeSpaces(String s) {
        // code here
        String[] st=s.trim().split("\\s+");
        String ans=" ";
        for(String res:st){
            ans+=res;
        }
        return ans;
    }
}