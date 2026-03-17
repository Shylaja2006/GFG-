class Solution {
    public int getSecondLargest(int[] arr) {
        
        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] > l){
                s = l;
                l = arr[i];
            }
            else if(arr[i] > s && arr[i] != l){
                s = arr[i];
            }
        }

        if(s == Integer.MIN_VALUE){
            return -1;
        }

        return s;
    }
}