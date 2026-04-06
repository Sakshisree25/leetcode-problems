class Solution {
    public int findGCD(int[] nums) {
        int s=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<s)
            {
                s=nums[i];
            }
            if(nums[i]>l)
            {
                l=nums[i];
            }
        }
        int x=1;
        for(int i=1;i<=l;i++)
        {
            if(s%i==0 && l%i==0)
            {
               x=i;
            }
        }
      return x;
    }
}