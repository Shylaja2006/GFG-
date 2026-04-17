// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] f=new int[n];
        int a=0;
        int b=1;
        f[0]=a;
        if(n>1){
            f[1]=1;
        }
        for(int i=2; i<n; i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }
}