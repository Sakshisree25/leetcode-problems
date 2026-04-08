class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
         int oddNum = 1;
        int evenNum = 2;
        for(int i=1;i<=n;i++)
        {
            odd += oddNum;
            even += evenNum;

            oddNum += 2;
            evenNum += 2;
        }
        int a=odd;
        int b=even;
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a = a % b;
            }
           
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }

        }
    
