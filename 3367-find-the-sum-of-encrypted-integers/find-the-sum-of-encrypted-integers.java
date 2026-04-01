class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int m=0;
            int c=0;
            while(n!=0)
            {
               int d=n%10;
               if(d>m)
               {
                m=d;
               }
                n=n/10;
                c++;
            }
            int z=0;
            for(int j=0;j<c;j++)
            {
                z=z*10+m;
            }
            total+=z;
        }
        return total;
    }
}