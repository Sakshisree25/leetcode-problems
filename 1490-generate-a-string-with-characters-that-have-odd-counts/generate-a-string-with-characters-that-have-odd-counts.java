class Solution {
    public String generateTheString(int n) {
        int num=n;
        String res="";
        if(num%2==1)
        {
            for(int i=0;i<num;i++)
            {
                res+='a';
            }
        }
        else 
        {
            for(int i=0;i<n-1;i++)
            {
                res+='a';
            }
            res+='b';
        }
        return res;
    }
}