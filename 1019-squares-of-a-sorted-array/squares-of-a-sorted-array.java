class Solution {
    public int[] sortedSquares(int[] nums) {
       int a[]=new int[nums.length];
       int index=0;
       int r=0;
       for(int i=0;i<nums.length;i++)
       {
         r=nums[i]*nums[i];
         a[index++]=r;
       } 
       Arrays.sort(a);
       return a;
    }
}