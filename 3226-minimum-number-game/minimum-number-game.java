class Solution {
    public int[] numberGame(int[] nums) {
        int[]a=new int[nums.length];
        int index=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
              a[index]=nums[i];
              index+=2;
            }
            
        }
        index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==1)
            {
              a[index]=nums[i];
              index+=2;
            }
          
        }
        return a;

    }
}