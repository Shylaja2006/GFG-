class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:arr){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        int l=arr.length;
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()>l/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}