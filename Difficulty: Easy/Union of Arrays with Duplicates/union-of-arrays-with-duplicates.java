class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
       HashSet<Integer> h1=new HashSet<>();
       for(int a1:a){
           h1.add(a1);
       }
       for(int a2:b){
           h1.add(a2);
       }
       return new ArrayList<>(h1);
       
       
       
    }
}