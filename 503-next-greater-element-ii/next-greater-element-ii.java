class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           boolean found = false;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])
                {
                    a[i]=nums[j];
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                for(int k=0;k<i;k++)
                {
                    if(nums[k]>nums[i])
                    {
                        a[i]=nums[k];
                        found=true;
                        break;
                    }
                }
            }
            if(!found)
            {
                 a[i] = -1;
            }
        }
        return a;
        
    }
}