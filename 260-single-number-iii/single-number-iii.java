class Solution {
    public int[] singleNumber(int[] nums) {
        int[]r=new int[2];
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(int x:m.keySet())
        {
            if(m.get(x)==1)
            {
                r[index++]=x;
            }
        }
        return r;
    }
}