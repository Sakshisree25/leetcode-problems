class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int ss=0;
        int num=n;
        while(num!=0)
        {
            int d=num%10;
            sum+=d;
            ss+=(d*d);
            num/=10;
        }
       if(ss-sum>=50)
       {
        return true;
       }
       return false;
    }
}