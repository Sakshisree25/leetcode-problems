class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int x:m.keySet())
        {
            if(m.containsKey(x+1))
            {
                int l=m.get(x)+m.get(x+1);
                ans=Math.max(ans,l);
            }
        }
        return ans;
    }
}