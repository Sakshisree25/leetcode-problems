class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
       int f[]=new int[101];
       for(int i=0;i<nums.length;i++)
       {
         f[nums[i]]++;
       } 
       int s=0;
       for(int i=1;i<=100;i++)
       {
           if(f[i]%k==0)
           {
            s+=f[i]*i;
           }
       }
       return s;
    }
}