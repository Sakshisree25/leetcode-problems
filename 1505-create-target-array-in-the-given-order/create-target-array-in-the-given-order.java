class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int [] res=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            res[i]=a.get(i);
        }
        return res;
    }
}