class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>m=new HashMap<>();
       for(int i=0;i<nums1.length;i++)
       {
        m.put(nums1[i],m.getOrDefault(nums1[i],0)+1);
       }
       for(int x:nums2)
       {
        if(m.containsKey(x))
        {
            return x;
        }
       }
       return -1;
    }
}