// User function Template for Java
class Solution {
    String transform(String Str) {
        // code here
        StringBuilder res=new StringBuilder();
        for(int i=0; i<Str.length(); i++){
            char ch=Str.charAt(i);
        if(isVowel(ch)){
            continue;
        }
        if(Character.isLowerCase(ch)){
            ch=Character.toUpperCase(ch);
        }else{
            ch=Character.toLowerCase(ch);
        }
        res.append("#").append(ch);
        }
        if(res.length()==0) return "-1";
        return res.toString();
    }
    boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}