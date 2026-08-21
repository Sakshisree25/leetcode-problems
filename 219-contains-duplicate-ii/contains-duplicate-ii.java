class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
       /* int f=0;
        for(int i=0;i<nums.length;i++)
        {
           for(int j=i+1;j<nums.length;j++)
           {
            if(nums[i]==nums[j])
            {
                if(Math.abs(i-j)<=k)
                {
                    f=1;
                }
            }
           }
        }
        if(f==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        */
         for(int i=0;i<nums.length;i++)
         {
            if(m.containsKey(nums[i]))
            {
                int p=m.get(nums[i]);
                if(i-p<=k)
                {
                    return true;
                }
            }
            m.put(nums[i],i);
         }
         return false;
    }
}