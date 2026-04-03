class Solution {
    public int alternateDigitSum(int n) {
        int num=n;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        int sum=0;
        int sign=1;
        int r=rev;
        while(r!=0)
        {
            int d=r%10;
           sum=sum+sign*d;
           sign=sign*-1;
           r=r/10;
        }
        return sum;
    }
}