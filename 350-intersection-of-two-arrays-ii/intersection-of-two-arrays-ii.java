class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     int[] temp = new int[Math.min(nums1.length, nums2.length)];
      HashMap<Integer,Integer>m=new HashMap<>();
      for(int i=0;i<nums1.length;i++)
      {
        m.put(nums1[i],m.getOrDefault(nums1[i],0)+1);
      }
      int index=0;
      for(int i=0;i<nums2.length;i++)
      {
        if(m.containsKey(nums2[i]) && m.get(nums2[i])>0)
        {
            temp[index]=nums2[i];
            index++;
             m.put(nums2[i], m.get(nums2[i]) - 1);
        }
      }
      int []res=new int[index];
      for(int i=0;i<index;i++)
      {
        res[i]=temp[i];
      }
      return res;
    }
}