class Solution {
    public int numberOfMatches(int n) {
        int num=n;
        int m=0;
        int total=0;
        while(n>1)
        {
            if(n%2==0)
            {
                 m=n/2;
                  n=n/2;
            }
            else if(n%2==1)
            {
                m=(n-1)/2+1;
                 n=(n-1)/2;

            }
            total=total+m;
        }
      return total;
    }
}