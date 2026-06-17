class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:arr){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            res.add(temp);
        }
        return res;
    }
}