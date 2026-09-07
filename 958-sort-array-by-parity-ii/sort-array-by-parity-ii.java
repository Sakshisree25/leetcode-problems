class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[]o=new int[10000];
        int []e=new int[10000];
        int index=0;
        int in=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                e[index++]=nums[i];
            }
            else if(nums[i]%2==1)
            {
                o[in++]=nums[i];
            }
        }
        int r[]=new int[nums.length];
        int ind=0;
        int j=0;
        for(int i=0;i<nums.length;i+=2)
        {
                r[i]=e[j];
                j++;
        }
            j=0;
        for(int i=1;i<nums.length;i+=2)
        {
                r[i]=o[j];
                j++;

        }

        return r;
    }
}