class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        /*ArrayList<Integer> res=new ArrayList<>();
        for(int i:arr1){
            res.add(arr1[i]);
        }
        for(int j:arr2){
            res.add(arr2[j]);
        }*/
        HashSet<Integer> s=new HashSet<>();
        for(int i:arr1){
            s.add(i);
        }for(int j:arr2){
            s.add(j);
        }
        ArrayList<Integer> res=new ArrayList<>(s);
        Collections.sort(res);
        return res;
    }
}
