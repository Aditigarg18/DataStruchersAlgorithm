class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       int i=0,j=0;
       int m=a.length;
       int n=b.length;
       ArrayList<Integer>ans=new ArrayList<>();
       while(i<m && j<n){
           if(a[i]<b[j]){
               if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i])
                   ans.add(a[i]);
                   i++;
               }
               else if(b[j]<a[i]){
                     if(ans.isEmpty() || ans.get(ans.size()-1)!=b[j])
                         ans.add(b[j]);
                         j++;
               }
               else{
      if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i])
                   ans.add(a[i]);
                   i++;
                   j++;
               
           }
       }
        while(i<m){
              if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i])
                  ans.add(a[i]);
                  i++;
        }
        while(j<n){
              if(ans.isEmpty() || ans.get(ans.size()-1)!=b[j])
                  ans.add(b[j]);
                  j++;
        }
       return ans; 
    }
}

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<a.length;i++){
           ans.add(a[i]);
            }
             for(int i=0;i<b.length;i++){
           ans.add(b[i]);
        }
     ArrayList<Integer> arr = new ArrayList<>(ans);
     Collections.sort(arr);
        return arr;
    }
}
