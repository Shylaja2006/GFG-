class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0;
        int digit=Math.abs(n);
        while(digit!=0){
            int temp=digit%10;
            rev=rev*10+temp;
            digit=digit/10;
        }
        if(rev==Math.abs(n)){
            return true;
        }else{
            return false;
        }
        }    
}