class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
      int n0=0;
      int n1=1;
      int s=0;
      for(int i=2;i<=n;i++)
      {
        s=n0+n1;
        n0=n1;
        n1=s;
      
      }
      return s;
      
    }
}