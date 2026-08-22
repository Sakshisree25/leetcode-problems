class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>>ll=new ArrayList<>(); 
       List<Integer>l1=new ArrayList<>();
       List<Integer>l2=new ArrayList<>();

       HashSet<Integer>s1=new HashSet<>();
       HashSet<Integer>s2=new HashSet<>();
       for(int i=0;i<nums1.length;i++)
       {
        s1.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++)
       {
        s2.add(nums2[i]);
       }
       for(int x:s1)
       {
        if(!s2.contains(x))
        {
            l1.add(x);
        }
       }
        for(int x:s2)
       {
        if(!s1.contains(x))
        {
            l2.add(x);
        }
       }
        ll.add(l1);
        ll.add(l2);
        return ll;
    }
}