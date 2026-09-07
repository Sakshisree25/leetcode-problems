class Solution {
    public int[] separateDigits(int[] nums) {
       ArrayList<Integer>r=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        int n=nums[i];
        ArrayList<Integer>m=new ArrayList<>();
        while(n!=0)
        {
           m.add(n%10);
           n=n/10;
        }
         for(int j = m.size() - 1; j >= 0; j--) {
                r.add(m.get(j));
            }
       } 
       int a[]=new int[r.size()];
       for(int i=0;i<a.length;i++)
       {
        a[i]=r.get(i);
       }
       return a;

    }
}