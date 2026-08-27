class Solution {
    public int sumOfUnique(int[] nums) {
       int f[]=new int[1000];
       for(int i=0;i<nums.length;i++)
       {
           f[nums[i]]++;
       }
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        if(f[nums[i]]==1)
        {
          sum+=nums[i];
        }
       }
       return sum;
       
    }
}