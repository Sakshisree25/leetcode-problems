class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        int n=nums.length;
      for(int i=0;i<n;i++)
      {
         int d=nums[i];
         if (d == 0 && digit == 0) {
                c++;
               continue;
    }
         while(d!=0)
         {
            if(d%10==digit)
            {
                c++;
            }
            d=d/10;
         }
      }  
      return c;
    }
}