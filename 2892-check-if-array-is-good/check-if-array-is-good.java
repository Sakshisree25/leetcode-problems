class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int a=n;
        for(int i = 1; i < n; i++) {
             if(m.getOrDefault(i, 0) != 1) {
              return false;
             }
        }
        if(m.getOrDefault(n, 0) != 2) {
           return false;
        }
       return true;
    }
}