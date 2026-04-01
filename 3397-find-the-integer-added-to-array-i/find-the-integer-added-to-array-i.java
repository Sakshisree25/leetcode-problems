/*class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int s=nums2[0]-nums1[0]; 
        return s;
    }
}*/
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
           m1=Math.min(m1,nums1[i]);
           m2=Math.min(m2,nums2[i]);
        }
        return m2-m1;
    }
}
