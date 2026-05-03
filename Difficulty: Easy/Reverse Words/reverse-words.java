class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] st=s.trim().split("\\.");
        StringBuilder res=new StringBuilder();
        for(int i=st.length-1; i>=0; i--){
            if(!st[i].equals("")){
                if(res.length()>0){
                    res.append(".");
                }
                res.append(st[i]);
            }
        }
        return res.toString();
        
    }
}
