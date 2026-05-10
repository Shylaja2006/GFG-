

class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:arr){
            if(num>=k) res.add(num);
        }
        Collections.sort(res);
        return res;
    }
}