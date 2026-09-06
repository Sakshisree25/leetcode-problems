class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
            if(m.containsKey(nums[i]) && m.get(nums[i])==1)
            {
                return nums[i];
            }
            }
        }
        return -1;
    }
}