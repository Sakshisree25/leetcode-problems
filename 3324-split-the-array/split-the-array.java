class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int x: m.values())
        {
            if(x>2)
            {
                return false;
            }
        }
        return true;
    }
}