class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[0]);
        res.add(arr[arr.length-1]);
        return res;
    }
}
