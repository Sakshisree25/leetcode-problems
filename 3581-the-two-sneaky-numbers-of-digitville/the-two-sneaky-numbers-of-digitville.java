class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[]a=new int[2];
        int index=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int x:m.keySet())
        {
            if(m.get(x)>1)
            {
              a[index++]=x;
            }
        }
        return a;
    }
}