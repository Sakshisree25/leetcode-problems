class Solution {
    public int[] decompressRLElist(int[] nums) {
       ArrayList<Integer>a=new ArrayList<>();
      for(int i=0;i<nums.length;i+=2)
      {
       int f=nums[i];
       int v=nums[i+1];
       while(f!=0)
       {
        a.add(v);
        f--;
       }
    }
    int res[]=new int[a.size()];
    for(int i=0;i<res.length;i++)
    {
        res[i]=a.get(i);
    }
    return res;
}
}