class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        int s2=0;
        for(int i=0;i<nums.length;i++)
        {
            s1+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            while(n!=0)
            {
                s2=s2+n%10;
                n=n/10;
            }
        }
        return Math.abs(s1-s2);
    }
}