class Solution {
    public boolean isPerfectSquare(int num) {
      /* int low=1;
       int high=num;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(mid*mid==num)
        {
            return true;
        }
        if(mid*mid<num)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
       
       } 
       return false;*/
       for(long i=1;i*i<=num;i++)
       {
           if(i*i==num)
           {
            return true;
           }
       }
       return false;

    }
}