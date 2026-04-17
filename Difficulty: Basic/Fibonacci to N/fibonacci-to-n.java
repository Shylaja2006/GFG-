// User function Template for Java

class Solution {
    ArrayList<Integer> nFibonacci(int N) {
        // code here
        ArrayList<Integer> f=new ArrayList<>();
        int a=0;
        int b=1;
        f.add(a);
        if(N>=1){
            f.add(b);
        }
        while(true){
            int next=a+b;
            if(next>N){
                break;
            }
            f.add(next);
            a=b;
            b=next;
            
        }
        return f;
}
}