class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        long n=arr.length+1;
        long sum=n*(n+1)/2;
        long totalsum=0;
        for(int i=0; i<arr.length; i++){
            totalsum+=arr[i];
        }
        return (int)(sum-totalsum);
    }
}