class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++)
        { 
           int sum=0;
           int n=i;
           while(n!=0)
           {
               sum+=n%10;
               n=n/10;
           }
          
            m.put(sum,m.getOrDefault(sum,0)+1);
           
        }
        int max=0;
        for(int x:m.values())
        {
            if(x>max)
            {
                max=x;
            }
        }
        return max;
    }
}