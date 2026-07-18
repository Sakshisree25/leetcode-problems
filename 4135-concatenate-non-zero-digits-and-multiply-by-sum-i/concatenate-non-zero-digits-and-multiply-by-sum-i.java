class Solution {
    public long sumAndMultiply(int n) {
        int num=n;
        int rev=0;
        while(num!=0)
        {
            int d=num%10;
            if(d!=0)
            {
              rev=rev*10+d;
            }
            num/=10;
        }
        int r1=0;
        while(rev!=0)
        {
            int d=rev%10;
                r1=r1*10+d;
                rev=rev/10;
        }
          int r2=r1;
          int sum=0;
          while(r2!=0)
          {
               sum+=r2%10;
               r2/=10;
          }
          long ans=(long)r1*sum;
          return ans;
    }
}