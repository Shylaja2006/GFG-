class Solution {
    int convertfive(int num) {
        // Your code here
        String s=String.valueOf(num);
        String s1=s.replaceAll("0","5");
        return Integer.parseInt(s1);
    }
}