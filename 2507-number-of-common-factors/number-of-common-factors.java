class Solution {
    public int commonFactors(int a, int b) {
        int c=1;
        int min=Integer.MAX_VALUE;
        if(a<b)
        {
            min=a;
        }
        else
        {
            min=b;
        }
        for(int i=2;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
            }
        }
        return c;
    }
}