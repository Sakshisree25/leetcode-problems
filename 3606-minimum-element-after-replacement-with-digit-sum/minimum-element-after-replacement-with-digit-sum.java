class Solution {
    public int minElement(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int s=0;
            while(n!=0)
            {
                s=s+n%10;
                n=n/10;
            }
            a[i]=s;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
                if(a[i]<min)
                {
                    min=a[i];
                }
        }
        return min;
    }
}