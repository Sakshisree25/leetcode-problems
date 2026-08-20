class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r=new int[nums.length];
        int p=1;
        int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else
            {
                p=p*nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero>1)
            {
               r[i]=0;
            }
            else if(zero==1)
            {
                if(nums[i]==0)
                {
                    r[i]=p;
                }
                else
                {
                    r[i]=0;
                }
            }
            else
            {
                r[i]=p/nums[i];
            }
        }
        return r;
    }
}