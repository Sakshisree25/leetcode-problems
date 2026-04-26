class Solution {
    public int[] transformArray(int[] nums) {
       /* int[]a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[i]=0;
            }
            if(nums[i]%2==1)
            {
               a[i]=1;
            }
        }
        Arrays.sort(a);
        return a;*/
        int n=nums.length;
        int count=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                ans[i]=0;
            }else{
                ans[i]=1;
            }
        }
        return ans;

    }
}