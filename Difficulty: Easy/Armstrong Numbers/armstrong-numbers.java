// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=digit*digit*digit;
            temp=temp/10;
        }
        return sum==n;
    }
}