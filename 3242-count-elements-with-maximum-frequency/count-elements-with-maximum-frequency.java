class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []f=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            f[nums[i]]++;
        }
        int max=0;
        int c=0;
        for(int i=0;i<f.length;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
            }
        }
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==max)
            {
                c++;
            }
        }
        return c*max;
    }
}