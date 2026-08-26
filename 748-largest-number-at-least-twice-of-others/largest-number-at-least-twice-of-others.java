class Solution {
    public int dominantIndex(int[] nums) {
        int m=Integer.MIN_VALUE;
        int in=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                in=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=in && m<2*nums[i])
            {
               return -1;
            }
        }
        return in;
    }
}