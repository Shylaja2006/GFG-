// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashSet<Integer> h=new HashSet<>();
        for(int n:arr){
            if(h.contains(n)){
                return true;
            }
            h.add(n);
        }return false;
    }
}