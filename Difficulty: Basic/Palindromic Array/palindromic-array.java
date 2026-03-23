/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int num:arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
    }
      public static boolean isPalindrome(int num){
          int o=num;
          int rev=0;
          while(num>0){
              int temp=num%10;
              rev=rev*10+temp;
              num=num/10;
          }
          return o==rev;
          
      }
        
    }