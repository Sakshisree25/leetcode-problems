class Solution {
    public int passwordStrength(String password) {
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
     HashSet<Character>s=new HashSet<>();
        for(int i=0;i<password.length();i++)
        {
           if(!s.contains(password.charAt(i)))
           {
             s.add(password.charAt(i));
            if(password.charAt(i)>='a' && password.charAt(i)<='z')
            {
                p1=p1+1;
            }
            else if(password.charAt(i)>='A' && password.charAt(i)<='Z')

            p2=p2+2;
        
           else if(password.charAt(i)>='0' && password.charAt(i)<='9')
           {
            p3=p3+3;
           }
          else if(password.charAt(i)=='!' || password.charAt(i)=='@' || password.charAt(i)=='#' || password.charAt(i)=='$')
        {
            p4=p4+5;
        }
           }
           else
           {
                 continue;
           }
        }
    
   int res= p1+p2+p3+p4;
   return res;
    }
}