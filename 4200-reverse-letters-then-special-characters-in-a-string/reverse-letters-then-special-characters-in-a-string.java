class Solution {
    public StringBuilder reverse(StringBuilder s)
    {

        int l=0;
        int r=s.length()-1;
        char c[]=s.toString().toCharArray();
        while(l<r)
        {
          char t=c[l];
            c[l]=c[r];
            c[r]=t;
            l++;
            r--;
        }
       return new StringBuilder(new String (c));
    }
    public String reverseByType(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)>='a' && s.charAt(i)<='z')
        {
            sb1.append(s.charAt(i));
        }
       else
       {
             sb2.append(s.charAt(i));
       }
        }
        sb1=reverse(sb1);
        sb2=reverse(sb2);
        int p1=0;
        int p2=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)>='a' && s.charAt(i)<='z')
        {
              ans.append(sb1.charAt(p1++));
        }
        else
        {
            ans.append(sb2.charAt(p2++));
        }
       }
       return ans.toString();
    }
}