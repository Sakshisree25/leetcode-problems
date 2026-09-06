class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>s=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        s.add(nums[i]);
       }
       int r=k;
       while(s.contains(r))
       {
        r+=k;
       }
       return r;
    }
}