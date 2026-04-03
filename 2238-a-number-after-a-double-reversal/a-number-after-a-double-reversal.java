class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int s=0;
        while(n!=0)
        {
           s=s*10+n%10;
            n=n/10;
        }
        int s1=0;
        while(s!=0)
        {
            s1=s1*10+s%10;
            s=s/10;
        }
        if(s1==num)
        {
            return true;
        }
        return false;
    }
}