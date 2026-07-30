class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int f[]=new int[10001];
        for(int i=0;i<nums.length;i++)
        {
            f[nums[i]]++;
        }
        int ans=0;
        for(int i=0;i<10001;i++)
        {
            if(f[i]>1)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}