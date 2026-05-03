class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int left=-1;
        int right=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                if(left==-1){
                    left=i;
                }
                right=i;
            }
        }
        res.add(left);
        res.add(right);
        return res;
    }
}