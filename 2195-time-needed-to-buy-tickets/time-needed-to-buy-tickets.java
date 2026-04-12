class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int time=0;
        for(int i=0;i<=k;i++)
        {
           time+=Math.min(arr[i],arr[k]);
        }
        for(int i=k+1;i<arr.length;i++)
        {
            time+=Math.min(arr[i],arr[k]-1);
        }
        return time;


    }
}