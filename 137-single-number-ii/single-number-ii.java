class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer>m=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
      }
      int ans=0;
      for(int x:m.keySet())
      {
        if(m.get(x)==1)
        {
            ans=x;
        }
      }
      return ans;
       
}
}