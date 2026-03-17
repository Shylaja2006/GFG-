// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        Set<Integer> d=new LinkedHashSet<>();
        for(int num:arr){
            d.add(num);
        }
        return new ArrayList<>(d);
    }
}