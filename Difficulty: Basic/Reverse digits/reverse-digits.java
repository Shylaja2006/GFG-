// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        int temp=Math.abs(n);
        while(n!=0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return rev;
    }
}