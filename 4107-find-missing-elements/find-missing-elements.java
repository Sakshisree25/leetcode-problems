class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer>l=new ArrayList<>();
         int mini=Integer.MAX_VALUE;
         int maxi=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]>maxi)
            {
                maxi=nums[i];
            }
             if(nums[i]<mini)
            {
                mini=nums[i];
            }
         }
         HashSet<Integer>s=new HashSet<>();
         for(int num:nums)
         {
            s.add(num);
         }
         for(int i=mini;i<=maxi;i++)
         {
            if(!s.contains(i))
            {
                l.add(i);
            }
         }
         return l;
    }
}
//Aa6Ecam1ahchax8I