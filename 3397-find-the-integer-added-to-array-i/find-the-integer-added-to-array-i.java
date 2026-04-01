class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int s=nums2[0]-nums1[0]; 

        
        return s;
    }
}