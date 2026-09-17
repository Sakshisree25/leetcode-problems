class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            }
        }
        int maxi=Integer.MIN_VALUE;
        int ans=-1;
     for(int x:m.keySet())
     {
        if(m.get(x)>maxi)
        {
            maxi=m.get(x);
            ans=x;
        }
        else if(m.get(x)==maxi)
        {
            if(x<ans)
            {
                ans=x;
            }
        }
     }
     return ans;
    }
}