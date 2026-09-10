class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[]l=new int[nums.length];
        int []r=new int[nums.length];
        l[0]=0;
        r[nums.length-1]=0;
        int in=1;
        for(int i=1;i<nums.length;i++)
        {
            int sum=0;
            for(int j=0;j<i;j++)
            {
               sum+=nums[j];
            }
            l[in++]=sum;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            int sum=0;
            for(int j=nums.length-1;j>i;j--)
            {
                sum+=nums[j];
            }
            r[i]=sum;
        }
        int[]ans=new int[nums.length];
        for(int i=0;i<l.length;i++)
        {
            ans[i]=Math.abs(l[i]-r[i]);
        }
         return ans;
    }
}