class Solution {
    static String decToBinary(int n) {
        // code here
       String res="";
       while(n>0){
           if(n%2==1)
              res+='1';
            else
                res+='0';
        n=n/2;
       }
         String reversed = new StringBuilder(res).reverse().toString();
         return reversed;
    }
}
