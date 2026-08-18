class Solution {
    public int maxProductDifference(int[] nums) {
        int a=0;
        int b=0;
        int c=Integer.MAX_VALUE;
        int d=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=a)
            {
                b=a;
                a=nums[i];
            }
            if(nums[i]<a && nums[i]>b)
            {
                b=nums[i];
            }
            if(nums[i]<=c)
            {
                d=c;
                c=nums[i];
            }
            if(nums[i]>c && nums[i]<d)
            {
                d=nums[i];
            }
        }
        return (a*b)-(c*d);

    }
}