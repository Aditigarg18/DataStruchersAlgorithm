class Solution {
    public boolean rotateString(String s, String goal) {
//       int m=s.length();
//       int n=goal.length();
//       if(m!=n)return false;
//       for(int i=1;i<=m;i++){
//         s=s.substring(1)+s.charAt(0);
//         //bcdea
//         //cdeab
//         //deabc
//         //eabcd
//         //abcde
//         if(s.equals(goal))
//           return true;     
//       }  
//       return false;
//     }
// }
int m=s.length();
int n=goal.length();
if(m!=n)return false;
if(m==n && (s+s).contains(goal))return true;
return false;
    }
}
