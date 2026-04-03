class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        int n=num;
        while(n!=0)
        {
            if(n%2==0)
            {
                n=n/2;
                c++;
            }
            else if(n%2==1)
            {
                n=n-1;
                c++;
            }
        }
        return c;
    }
}