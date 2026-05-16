class Solution {
    public double findMaxAverage(int[] nums, int k) {
    /* int sum=0;
     double maxi=0;
    double ans=0;
      for(int i=0;i<k;i++)
      {
        sum+=nums[i];
      }
      maxi=(double)sum/k;
      for(int i=k;i<nums.length;i++)
      {
        sum-=nums[i-k];
        sum+=nums[i];
        ans=(double)sum/k;
        if(ans>maxi)
        {
            maxi=ans;
        }
      }
      return maxi;*/
      int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }
}