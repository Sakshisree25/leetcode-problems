class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
      for(int k=0;k<nums.length-1;k++)
      {
        int s1=0;
        int s2=0;
      for(int i=0;i<=k;i++)
      {
        
         s1+=nums[i];
      }
         for(int j=k+1;j<nums.length;j++)
         {
            s2+=nums[j];
         }
         int t=Math.abs(s1-s2);
         if(t%2==0)
         {
            c++;
         }
      
      }
      return c; 
    }
}