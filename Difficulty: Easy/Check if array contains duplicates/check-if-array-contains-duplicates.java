// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashSet<Integer> s=new HashSet<>();
        for(int n:arr){
            if(s.contains(n)){
                return true;
            }
            s.add(n);
        }
        return false;
    }
}