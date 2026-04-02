class Solution {
    public String reverseWords(String s) {
       char c[]=s.toCharArray();
       int start=0;
       for(int i=0;i<=c.length;i++)
       {
        if(i==c.length || c[i]==' ')
        {
            reverse(c,start,i-1);
            start=i+1;
        }
       }
        return new String(c);

    }
    private void reverse(char[] c,int l ,int r)
    {
        while(l<r)
        {
            char t=c[l];
            c[l]=c[r];
            c[r]=t;
            l++;
            r--;
        }
    }
        
        
}
        
    
